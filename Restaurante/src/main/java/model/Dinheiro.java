/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author yvasouza
 */
public class Dinheiro implements MetodoPagamento{

    private double valor;

    public Dinheiro(double valor) {      
        setValor(valor);
    }   

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor para o campo valor está incorreto");
        }
        this.valor = valor;
    }
    
    @Override
    public double calcularDesconto(Pedido pedido) {          
        return pedido.calcularValorPedido() * 0.10;
    }

    @Override
    public double calcularTroco(double valorPedido) {
       double troco = valor - valorPedido;
       return troco;
    }
    
}
