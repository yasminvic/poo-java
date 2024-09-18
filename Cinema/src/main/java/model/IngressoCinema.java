package model;

/**
 * 
 * @author yvasouza
 */
public class IngressoCinema {
    private boolean estudante;
    private DiaSemana diaSemana;
    
    public static float PRECO_BASE = 15f;

    public IngressoCinema(boolean estudante, DiaSemana diaSemana) {
        setEstudante(estudante);
        setDiaSemana(diaSemana);
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        if(diaSemana == null){
            throw new IllegalArgumentException("Dia da Semana não pode ser vazio");
        }
        this.diaSemana = diaSemana;
    }
    
    /**
     * Método que calcula o preço total do ingresso do cinema baseado no dia  da semana
     * e se o comprante é estudante ou não.
     * @return O preço total do ingresso
     */
    public float precoIngresso(){
        float valorIngresso = PRECO_BASE;
        
        switch(this.diaSemana){
            case TERCA:
            case QUARTA:
            case QUINTA:
                valorIngresso -= 0.5 * valorIngresso;
                break;
            
            case SABADO:
            case DOMINGO:
                valorIngresso += 0.4 * valorIngresso;
                if(estudante){
                    valorIngresso -= 0.3 * valorIngresso;
                }
                break;
                
            case SEGUNDA:
            case SEXTA:
                if(estudante){
                    valorIngresso -= 0.3 * valorIngresso;
                }
                break;
        }
        
        return valorIngresso;
    }
}
