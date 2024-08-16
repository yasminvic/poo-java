package Entity;

public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo;

    //GETTERS e SETTERS
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }

    /**
     * 
     * @param valor
     * @return metodo depositar
     */
    public void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Não é possível depositar valores negativos!";
        }
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        if(valor > this.saldo){
            throw new IllegalArgumentException("Saque não efetuado. Valor de saque maior que o saldo atual!");
        }
        
        if(valor < 0){
            throw new IllegalArgumentException("Não é possível depositar valores negativos!");
        }
        
        this.saldo -= valor;
    }
    /**
     *
     * @param valor
     * @param contaDestino
     * @return
     */
    public String transferir(double valor, ContaBancaria contaDestino){        
        this.sacar(valor);
        contaDestino.depositar(valor);
        
        return "Tranferência realizada com sucesso!";
    }
}
