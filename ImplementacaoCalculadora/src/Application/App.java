package Application;

import Entity.Calculadora;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        String continuar = "S";
        do{
            System.out.println(" Menu ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("Escolha a operação que deseja realizar: ");
            int opcao = scan.nextInt();
            
            System.out.println("Digite o valor do número 1:");
            calc.setNum1(scan.nextInt());
            
            System.out.println("Digite o valor do número 2:");
            calc.setNum2(scan.nextInt());
            
            switch(opcao){
                case 1:
                    System.out.println("Resultado da soma: " + calc.somar());
                    break;
                case 2:
                    System.out.println("Resultado da soma: " + calc.subtrair());
                    break;
                case 3:
                    System.out.println("Resultado da soma: " + calc.dividir());
                    break;
                case 4:
                    System.out.println("Resultado da soma: " + calc.multiplicar());
                    break;
                default:
                    break;
            }
            
            System.out.println("Deseja continuar? S - Sim e N - Não ");
            continuar = scan.next().toUpperCase();
        }while(continuar.equals("S"));

    }
    
}
