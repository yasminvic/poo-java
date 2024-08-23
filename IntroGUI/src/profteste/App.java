package profteste;

import javax.swing.JOptionPane;

public class App {

    static int qtdContas = 0;
    static ContaBancaria[] contas = new ContaBancaria[10];

    public static void main(String[] args) {
        int comando = 0;
        boolean executar = true;
        do {
            comando = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opcao:\n 1-Cadastrar\n2-Sacar\n3-Depositar\n4-Sair"));
            switch (comando) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    executar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando invalido");
            }

        } while (executar);
    }

    public static ContaBancaria buscar(String numero) {
        if (qtdContas == 0) {
            return null;
        }
        for (ContaBancaria cb : contas) {
            if (cb.getNumero().equals(numero)) {
                return cb;
            }
        }
        return null;
    }

    public static void criarConta() {
        String titular = JOptionPane.showInputDialog(null, "Informe o nome do titular");
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada != null) {
            JOptionPane.showMessageDialog(null, "Conta ja cadastrada");
            return;
        }
        selecionada = new ContaBancaria(numero, titular);
        
        contas[qtdContas] = selecionada;
        qtdContas++;
    }

    public static void sacar() {
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada == null) {
            JOptionPane.showMessageDialog(null, "Conta nao existe");
            return;
        }

        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o valor do saque"));
        try {
            selecionada.sacar(valor);
        } catch (IllegalArgumentException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        JOptionPane.showMessageDialog(null, 
                "O saldo atual eh: "+ selecionada.getSaldo());
    }

    public static void depositar() {
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada == null) {
            JOptionPane.showMessageDialog(null, "Conta nao existe");
            return;
        }

        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o valor do deposito"));
        selecionada.depositar(valor);
        JOptionPane.showMessageDialog(null, 
                "O saldo atual eh: "+ selecionada.getSaldo());
    }
}
