package model;

public class pessoaFisica extends pessoa {
	private String nome;
	private long cpf;
	private long telefone;
	private String endereco;
	public String bairro;
	private String estado;
	public String cidade;
	public char[] getEstado;
	public String getCnpj;
	public String getCep;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public char[] getGetEstado() {
		return getEstado;
	}
	public void setGetEstado(char[] getEstado) {
		this.getEstado = getEstado;
	}
	public String getGetCnpj() {
		return getCnpj;
	}
	public void setGetCnpj(String getCnpj) {
		this.getCnpj = getCnpj;
	}
	public String getGetCep() {
		return getCep;
	}
	public void setGetCep(String getCep) {
		this.getCep = getCep;
	}
	

}
