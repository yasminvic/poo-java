package model;

public class Retangulo {
    private int altura;
    private int comprimento;

    public Retangulo(int altura, int comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
    }
    
    public Retangulo(){}

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("A altura tem que ser maior que zero.");
        }
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        if(comprimento <= 0){
            throw new IllegalArgumentException("O comprimento tem que ser maior que zero.");
        }
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro(){
        return (2*altura) + (2*comprimento);
    }
    
    public int calcularArea(){
        return altura*comprimento;
    }
}
