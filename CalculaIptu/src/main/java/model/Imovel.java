/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yvasouza
 */
public class Imovel {
   private String endereco;
   private int area;
   private Finalidade finalidade;
   private Bairro bairro;

    public Imovel(String endereco, int area) {
        setEndereco(endereco);
        setArea(area);     
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if(area < 0){
            throw new IllegalArgumentException("Defina um valor válido para a área");
        }
        this.area = area;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    

    public double calcularIptu(){
        double valorIptu = 0;
        switch(finalidade){
            case RESIDENCIAL:
                valorIptu = area * bairro.getCoeficienteIptu();
                break;             
            case COMERCIAL:
                valorIptu = calcularImovelComercial();
                break;          
            case INDUSTRIAL:
                valorIptu = calcularImovelIndustrial();
                break;
        }
        
        return valorIptu;
    }
    
    private double calcularImovelComercial(){
        if(area <= 100){
            return 500 * bairro.getCoeficienteIptu();
        }
        else if(area <=400 && area > 100){
            return 1000 * bairro.getCoeficienteIptu();
        }
        else{
            return area * 2.55 * bairro.getCoeficienteIptu();
        }
    }
    
    private double calcularImovelIndustrial(){
        if(area <= 2000){
            return 1000 * bairro.getCoeficienteIptu();
        }
        else{
            return area * 0.55 * bairro.getCoeficienteIptu();
        }
    }

}
