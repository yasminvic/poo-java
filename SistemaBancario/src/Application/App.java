package Application;

import Entity.ContaBancaria;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ContaBancaria conta = new ContaBancaria();
        
        String continuar = "S";
        do{
            System.out.println("------------------");
            System.out.println("|      Menu      |");
            System.out.println("|1 - Depositar   |");
            System.out.println("|2 - Sacar       |");
            System.out.println("|3 - Transferir  |");
            System.out.println("------------------");
            System.out.println("Escolha uma opção do menu: ");
            int opcao = scan.nextInt();
            
            double valor = 0;
            switch(opcao){
                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    valor = scan.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado com sucesso");
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    valor = scan.nextDouble();
                    conta.sacar(valor);
                    System.out.println("Depósito realizado com sucesso");
                    break;
                case 3:
                    ContaBancaria contaDestino = new ContaBancaria();
                    System.out.println("Informe o número da conta de destino: ");
                    contaDestino.setNumero(scan.next());
                    System.out.println("Informe o valor que deseja transferir: ");
                    valor = scan.nextDouble();
                    conta.transferir(valor, contaDestino);
            }
            
            System.out.println("Deseja realiza outra operação? S - Sim e N - Não");
            continuar = scan.next();
        }while(continuar.equals(continuar.toUpperCase()));
    }
}
