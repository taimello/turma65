package poo;

public class TestaConta {

	public static void main(String[] args) {
		Aula NovaConta = new Aula();
		
		NovaConta.setNumero(32);
		NovaConta.setAgencia(453);
		NovaConta.setTipo(2);
		NovaConta.setTitular("Nelson");
		NovaConta.setSaldo(2345);
		
		System.out.println("Número da conta: " + NovaConta.getNumero());
		System.out.println("Número da Agencia: " + NovaConta.getAgencia());
		System.out.println("Tipo da Conta: " + NovaConta.getTipo());
		System.out.println("Titular da conta: " + NovaConta.getTitular());
		System.out.println("Saldo da conta: " + NovaConta.getSaldo());
	}

}