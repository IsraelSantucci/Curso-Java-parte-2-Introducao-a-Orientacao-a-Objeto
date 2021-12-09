package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
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
}
