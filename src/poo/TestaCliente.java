package poo;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(null, null, null, null, 0, null);
		
		cliente1.setNome("Tainara");
		cliente1.setTelefone("(12) 92234-8877");
		cliente1.setCPF("123.***.***-34");
		cliente1.setRua("Maria Joana");
		cliente1.setBairro("Dom Pedro 1");
		cliente1.setNumero(79);
		cliente1.visualizar();
		
		System.out.println("\n");
		
		Cliente cliente2 = new Cliente("Maria Joana", 
				"(11)98877-9988", "234.***.***.-97", "Arapuca", 34, "Alphaville");
		
		cliente2.visualizar();
	}

}
