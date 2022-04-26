package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		
		Gato gatoBarthory = new Gato();
		gatoBarthory.setNome("Barthory");
		gatoBarthory.setCor("Cinza");
		gatoBarthory.setIdade(3);
		gatoBarthory.setSexo(true);
		
		Gato sushi = new Gato("sushi", "listrado", 5 , true);
		
		System.out.println(gatoBarthory);
		System.out.println(gatoBarthory.getSexo());
		System.out.println(gatoBarthory.getIdade());
		System.out.println(gatoBarthory.getCor());
		System.out.println(gatoBarthory.getNome());
		
		System.out.println(sushi);
		

		
		//Livros livros = new Livros();
		//System.out.println(livros);
		/*int b  = 2;
		int a = 3;
		System.out.println("Hello World!" + (b + a));*/
		 

	}

}

class Livros{
	private String nome;
	private String npag;
}
