package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 600;
		
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 150;
		
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
		System.out.println("Saldo Segunda Conta: " + segundaConta.saldo);
		
		
		System.out.println("Agencia primeira conta: " + primeiraConta.agencia);
		
		primeiraConta.agencia = 333;
		System.out.println("Agencia primeira conta depois de alterada o valor: " + primeiraConta.agencia);
		
		
		
		
	}
}
