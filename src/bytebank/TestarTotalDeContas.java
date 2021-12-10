package bytebank;

public class TestarTotalDeContas {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(854, 777);
		Conta conta2 = new Conta(555, 966);
		Conta conta3 = new Conta(774, 555);
		
		System.out.println("total de contas: " + Conta.getTotal());
	}
}
