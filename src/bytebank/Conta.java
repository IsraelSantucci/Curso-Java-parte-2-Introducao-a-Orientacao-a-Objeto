package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
    private static int total;
    
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Estou Criando a conta numero : " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando a conta agencia: " + this.agencia + " numero: " + this.numero);
	}
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
		if( agencia <= 0) {
			System.out.println("a agencia nao pode ser <= 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("o numero nao pode ser <= 0");
			return;
		}
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
	
	public static int getTotal() {
		return Conta.total;
	}
}
