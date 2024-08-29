package application;

import javax.swing.JOptionPane;
import model.Retangulo;

public class AppSemParametrosNoConstrutor {
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem-vindo ao programa! "
                + "\n\nInforme a altura do retângulo:"));
        
        int comp = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o comprimento do retângulo:"));
        
        /*try{
            ret.setAltura(altura);
            ret.setComprimento(comp);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }*/

        int opcao = 0;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção do menu: "
                + "\n\n1 - Calcular Perímetro"
                + "\n2 - Calcular Área"
                + "\n3 - Sair"));
            
            switch(opcao){
                case 1:
                    int perimetro = ret.calcularPerimetro();
                    JOptionPane.showMessageDialog(null, "O valor do perímetro é: " + perimetro);
                    break;
                case 2: 
                    int area = ret.calcularArea();
                    JOptionPane.showMessageDialog(null, "O valor da área é: " + area);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Tchauuu, encerrando programa :p");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!\nEscolha outra opção do menu");
                 
            }
        }while(opcao != 3);
        
    }
            
}
