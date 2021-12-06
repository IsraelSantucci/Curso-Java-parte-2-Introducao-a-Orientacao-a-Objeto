package bytebank;

public class TestReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 550;
		
		System.out.println("saldo Primeira Conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo Segunda Conta: " + segundaConta.saldo); // referencia para o mesmo objeto
		
		if(primeiraConta == segundaConta) {
			System.out.println("Contas iguais");
		}else {
			System.out.println("Contas Diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}

}
