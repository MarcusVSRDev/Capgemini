package IDEs.Model;

public class Gato {
	private String Nome;
	private String Cor;
	private Integer Idade;
	
	public Gato(String nome, String cor, Integer idade) {
		super();
		setNome(nome);
		setCor(cor);
		setIdade(idade);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer idade) {
		Idade = idade;
	}

	public String toString() {
		return "Gato [Nome=" + Nome + ", Cor=" + Cor + ", Idade=" + Idade + "]";
	}
	
	
}
