/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yvasouza
 */
public class Pagamento{

    private Pedido pedido;
    private MetodoPagamento metodo;

    public Pagamento(Pedido pedido, MetodoPagamento metodo) {
        setPedido(pedido);
        setMetodo(metodo);
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if(pedido == null){
            throw new IllegalArgumentException("Valor para o campo pedido está incorreto");
        }
        this.pedido = pedido;
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPagamento metodo) {
        if(metodo == null){
            throw new IllegalArgumentException("Valor para o campo metodo está incorreto");
        }
        this.metodo = metodo;
    }
    
    public double calcularTotalPagar(){
        return pedido.calcularValorPedido() - metodo.calcularDesconto(pedido);
    }
    
}
