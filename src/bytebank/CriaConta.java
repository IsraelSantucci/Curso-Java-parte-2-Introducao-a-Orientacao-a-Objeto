package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(220,012);
		primeiraConta.deposita(300);
		
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(600);
		
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(020,122);
		segundaConta.deposita(150);
		
		System.out.println("Saldo Primeira Conta: " + primeiraConta.getSaldo());
		System.out.println("Saldo Segunda Conta: " + segundaConta.getSaldo());
		
		
		System.out.println("Agencia primeira conta: " + primeiraConta.getAgencia());
		
		primeiraConta.setAgencia(333);
		System.out.println("Agencia primeira conta depois de alterada o valor: " + primeiraConta.getAgencia());
		
		
		
		
	}
}
