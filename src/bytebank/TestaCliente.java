package bytebank;

public class TestaCliente {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 122;
		primeiraConta.numero = 222;
		primeiraConta.saldo = 1100.50;
		
		Cliente cliente = new Cliente();
		cliente.nome = "Rafael";
		cliente.cpf = "111.111.111.11";
		cliente.profissao = "programador";
		
		primeiraConta.titular = cliente;
		System.out.println("--------------------------------");
		System.out.println("+++++++++++Extrato++++++++++++++");
		System.out.println("--------------------------------");
		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("Numero: " + primeiraConta.numero);
		System.out.println("Nome do titular: " + primeiraConta.titular.nome);
		System.out.println("Cpf: " + primeiraConta.titular.cpf);
		System.out.println("Profissão: " + primeiraConta.titular.profissao);
		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("--------------------------------");

		
	}
}
