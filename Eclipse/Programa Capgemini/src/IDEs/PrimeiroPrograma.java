package IDEs;

import IDEs.Model.Gato;

public class PrimeiroPrograma {
		public static void main(String[] args) {
			
			Gato gato = new Gato(null, null, null);
			Livro livros = new Livro();
			
			System.out.println(gato);
			System.out.println(livros);
			
			/*
			int a = 2;
			int b = 3;
			System.out.println("Hello World" + (a + b));
			*/
		}
}

class Livro{
	
	private String Nome;
}