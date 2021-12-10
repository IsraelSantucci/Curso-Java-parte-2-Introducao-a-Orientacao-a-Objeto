package bytebank;

public class TestaCliente {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(122, 222);
		//primeiraConta.setAgencia(122);
		//primeiraConta.setNumero(222);
		primeiraConta.deposita(1100.50);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Rafael");
		cliente.setCpf("111.111.111.11");
		cliente.setProfissao("programador");
		
		primeiraConta.setTitular(cliente);
		System.out.println("--------------------------------");
		System.out.println("+++++++++++Extrato++++++++++++++");
		System.out.println("--------------------------------");
		System.out.println("Agencia: " + primeiraConta.getAgencia());
		System.out.println("Numero: " + primeiraConta.getNumero());
		System.out.println("Nome do titular: " + primeiraConta.getTitular().getNome());
		System.out.println("Cpf: " + primeiraConta.getTitular().getCpf());
		System.out.println("Profissão: " + primeiraConta.getTitular().getProfissao());
		System.out.println("Saldo: " + primeiraConta.getSaldo());
		System.out.println("--------------------------------");

		
	}
}
