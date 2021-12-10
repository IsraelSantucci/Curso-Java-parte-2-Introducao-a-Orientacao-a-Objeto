package bytebank;

public class TestReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(888, 989);
		primeiraConta.deposita(550);
		
		System.out.println("saldo Primeira Conta: " + primeiraConta.getSaldo());
		
		primeiraConta.sacar(150);
		Conta segundaConta = primeiraConta;
		System.out.println("saldo Segunda Conta: " + segundaConta.getSaldo()); // referencia para o mesmo objeto
		
		if(primeiraConta == segundaConta) {
			System.out.println("Contas iguais");
		}else {
			System.out.println("Contas Diferentes");
		}
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}

}
