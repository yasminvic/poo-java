/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yvasouza
 */
public class CartaoFidelidade extends Cartao{
    
    public CartaoFidelidade(double saldo) {
        super(saldo);
    }
    
    @Override
    public double calcularDesconto(Pedido pedido){
        ArrayList<Prato> pratos = pedido.getPratos();     
        double valorDesconto  = 0;
        
        
        for (Prato prato : pratos) {
            if(prato.getCategoria() == Categoria.SOBREMESA){
                valorDesconto += prato.getValor();                        
            }
        }
        
        if(valorDesconto > 0){
            return valorDesconto;
        }
        
        return pedido.calcularValorPedido() * 0.3;
    }
}
