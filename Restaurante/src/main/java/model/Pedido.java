/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yvasouza
 */
public class Pedido {
    
    private ArrayList<Prato> pratos;

    public ArrayList<Prato> getPratos() {
        if(pratos == null){
         throw new IllegalArgumentException("Adicione algum prato no pedido!");
        }
        return pratos;
    }

    public Pedido(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }    
    
    public double calcularValorPedido(){
        double valorTotal = 0;
        
        for (Prato prato : pratos) {
            valorTotal += prato.getValor();
        }
        
        return valorTotal;
    }
    
    public void incluirPedido(Prato prato){
        pratos.add(prato);
    }
    
    public void removerPrato(Prato prato){
        pratos.remove(prato);
    }
    
    public void limparPedido(){
        pratos.removeAll(pratos);
    }
}
