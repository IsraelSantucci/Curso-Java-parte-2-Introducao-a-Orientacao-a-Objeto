package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	//se nao colocar a condição que o valor > 0, ocorrera um bug ao sacar com numeros negativos. 
	//o numero negativo ficara positivo com a atribuiçao -= 
	//e com isso seria possivel aumentar o saldo sacando com valor negativos.
	public boolean sacar(double valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean tranfere(double valor, Conta destino) {

		if (this.sacar(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
