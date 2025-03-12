public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;
    
    public ContaBancaria(String titular, int numero, double despositoInicial) {
        this.titular = titular;
        this.numero = numero;
        deposito(despositoInicial);
    }

    public ContaBancaria(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito){
        this.saldo += deposito;
    }

    public void saque(double saque){
        this.saldo -= saque;
    }

    @Override
	public String toString() {
		return "Titular: " 
					+ titular 
					+ "\nNúmero da conta: " 
					+ numero
					+ "\nSaldo: R$ " 
					+ String.format("%.2f", saldo) 
					+ "\n";
	}


}
