package encapsulamento;

public class TestaConta {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setNumero(032);
		conta1.setAgencia(22);
		conta1.setTipo("Corrente");
		conta1.setTitular("Jessica");
		conta1.setSaldo(10000);
		
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getTipo());
		System.out.println(conta1.getTitular());
		System.out.println(conta1.getSaldo());
		
	
	}

}
