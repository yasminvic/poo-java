
package model;

public class Ponto {
    private int x;
    private int y;

    public Ponto() {
    }

    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Boolean estaIncidindoSobreX(){
        if(y != 0){
            return false;
        }
        
        return true;
    }
    
    public Boolean estaIncidindoSobreY(){
        if(x != 0){
            return false;
        }
        
        return true;
    }
    
    public Quadrante identificarQuadrante(){
        if(y > 0 && x > 0){
            return Quadrante.PRIMEIRO;
        }
        else if(y > 0 && x < 0){
            return Quadrante.SEGUNDO;
        }
        else if(y < 0 && x < 0){
            return Quadrante.TERCEIRO;
        }
        else if(y < 0 && x > 0){
            return Quadrante.QUARTO;
        }
        
        return Quadrante.NENHUM;
    }
    
    public Double calcularDistancia(Ponto outroPonto){
        return calcularDistancia(this, outroPonto);
    }
    
    public static Double calcularDistancia(Ponto ponto1, Ponto ponto2){
        Double subtracaoX = Math.pow((ponto2.x - ponto1.x), 2);
        Double subtracaoY = Math.pow((ponto2.y - ponto1.y), 2);
        
        Double distancia = Math.sqrt(subtracaoX + subtracaoY);
        
        return distancia;
    }
}
