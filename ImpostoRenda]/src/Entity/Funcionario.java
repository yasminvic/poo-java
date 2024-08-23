/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author yvasouza
 */
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException{
        if(nome.isBlank() || nome.trim().isEmpty())
        {
            throw new IllegalArgumentException("O nome do funcionário não pode ser vazio!");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario <= 0)
        {
            throw new IllegalArgumentException("Valor inválido para o salário!");
        }
        this.salario = salario;
    }
    
    
}
