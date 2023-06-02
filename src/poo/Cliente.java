package poo;

public class Cliente {
	//Atributos para cliente
	private String nome;
	private String telefone;
	private String CPF;
	private String rua;
	private int numero;
	private String bairro;
	// metodo construtor com parametros para cliente
	
	public Cliente(String nome, String telefone, String CPF, String rua, int numero, String bairro) {
		this.nome = nome;
		this.telefone = telefone;
		this.CPF = CPF;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	// metodo visualizar
	public void visualizar() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Telefone:" + this.telefone);
		System.out.println("CPF:" + this.CPF);
		System.out.println("Rua:" + this.rua);
		System.out.println("N°:" + this.numero);
		System.out.println("Bairro:" + this.bairro);	
	}
	
}