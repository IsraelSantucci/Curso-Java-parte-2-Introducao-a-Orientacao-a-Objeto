package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDaMaria = new Conta(323, 855);
		//contaDaMaria.saldo = 1000;
		contaDaMaria.deposita(500);
		
		System.out.println("saldo da conta: " + contaDaMaria.getSaldo());
		
		contaDaMaria.sacar(350);
		System.out.println("saldo apos o saque: " + contaDaMaria.getSaldo());
	}
}
