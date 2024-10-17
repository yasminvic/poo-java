/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yvasouza
 */
public class Prato {
    
    private double valor;
    private String nome;
    private Categoria categoria;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor para o campo valor está incorreto");
        }
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome)  {
        if(nome.isEmpty() || nome.isBlank()){
            throw new IllegalArgumentException("Valor para o campo nome está incorreto");
        }   
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if(categoria == null){
            throw new IllegalArgumentException("Valor para o categoria nome está incorreto");
        }
        this.categoria = categoria;
    }

    public Prato(double valor, String nome, Categoria categoria) {
        setValor(valor);
        setNome(nome);
        setCategoria(categoria);
    }
    
    
}
