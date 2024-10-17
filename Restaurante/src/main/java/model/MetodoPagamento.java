/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author yvasouza
 */
public interface MetodoPagamento {
    
    public double calcularDesconto(Pedido pedido);
    public double calcularTroco(double valorPedido);
}
