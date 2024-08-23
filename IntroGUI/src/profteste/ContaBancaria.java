package profteste;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public ContaBancaria(String numero, String titular) {
        setNumero(numero);
        setTitular(titular);
    }
    
    public void setNumero(String numero) {
        
        if (numero == null || numero.isBlank()) {
           throw new IllegalArgumentException("O numero da conta informado eh invalido"); 
        }
        this.numero = numero;
    }
  
    public String getNumero() {
        return numero;
    }
    
    public void setTitular(String titular) {
        
        if (titular == null || titular.isBlank()) {
           throw new IllegalArgumentException("O numero da conta informado eh invalido"); 
        }
        this.titular = titular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do deposito eh invallido");
        }
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque eh invalido");
        }
        
        this.saldo -= valor;
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        if (contaDestino == null){
            throw new IllegalArgumentException("A conta nao existe");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
}
