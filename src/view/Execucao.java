package view;

import model.pessoaFisica;

public class Execucao {
	public static void main (String [] args) {
		
		pessoaFisica ps= new pessoaFisica();
		ps.setCep(12321334);
		ps.setEndereco("avenida danilinha");
		ps.setBairro("bela doida");
		ps.setCidade("sao paulo");
		ps.setEstado("sp");
		ps.setCnpj(12342224);
		
		System.out.println("Pessoa Fisica");
		System.out.println("CPF" + ps.getCep);
		System.out.println(ps.getEndereco());
		System.out.println(ps.bairro);
		System.out.println(ps.getEstado);
		System.out.println("CNPJ" + ps.getCnpj);
		System.out.println(ps.cidade);
		
		
	}
	
}
