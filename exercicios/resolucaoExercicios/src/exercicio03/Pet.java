package exercicio03;

public class Pet {
	private String nome;
	private String especie;
	private boolean limpo;

	public Pet(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
		this.limpo = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isLimpo() {
		return limpo;
	}

	public void setLimpo(boolean limpo) {
		this.limpo = limpo;
	}

	@Override
	public String toString() {
		return "Pet{" +
				"nome='" + nome + '\'' +
				", especie='" + especie + '\'' +
				", limpo=" + limpo +
				'}';
	}
}
