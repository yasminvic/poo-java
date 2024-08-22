/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introgui.joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author yvasouza
 */
public class App {
    static ContaBancaria[] contas = new ContaBancaria[10];
    static int qtdContas = 0;
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Informe o seu nome: "); //usuario poder digitar
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Título",
                JOptionPane.ERROR_MESSAGE);
        
        
        
        int comando = 0;
        boolean executar = true;
        
        do{
            comando = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:"
                    + "\n1 - Cadastrar"
                    + "\n2 - Sacar"
                    + "\n3 - Depositar"
                    + "\n4 - Sair"));
            
            switch(comando)
            {
                case 1:
                    boolean resultado = cadastrarConta();
                    if(resultado){
                        JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Conta já cadastrada!");
                    }
                    break;
                case 2:
                    if(realizarSaque()){
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                    }
                case 4: 
                    executar = false;
                    break;
                
            }
        }while(executar);
    }
    
    public static boolean cadastrarConta(){
        String titular = JOptionPane.showInputDialog(null, "Informe o nome do titular");
        String num = JOptionPane.showInputDialog(null, "Informe o número da conta");
        
        ContaBancaria selecionada = buscar(num);
        if(selecionada != null){
            return false;
        }
        
        ContaBancaria c = new ContaBancaria();
        c.setTitular(titular);
        c.setNumero(num);
        contas[qtdContas] = c;
        qtdContas++;
        
        return true;
        
    }
    
    public static ContaBancaria buscar(String numero){
        if(qtdContas == 0){
            return null;
        }
        
        for (ContaBancaria conta : contas) {
            if(conta.getNumero().equals(numero)){
                return conta;
            }
        }
        
        return null;
    }
    
    public static boolean realizarSaque(){
        String numero = JOptionPane.showInputDialog(null, "Informe o número da conta: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de saque: "));
        ContaBancaria c = buscar(numero);
        if(c == null){
            return false;
        }
        c.sacar(valor);
        return true;
    }
}
