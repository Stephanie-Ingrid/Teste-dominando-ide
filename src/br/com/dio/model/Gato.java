package br.com.dio.model;


public class Gato {
		
	private String nome;
	private String cor;
	private int idade;
	private boolean sexo;
	
	public Gato() {
	}
	
	public Gato(String nome, String cor, int idade, boolean sexo) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean getSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Dados do gato: " + " Nome: " + nome + " Idade: " + idade + " Cor: " + cor + " Sexo: " + sexo;
	}
	


}
