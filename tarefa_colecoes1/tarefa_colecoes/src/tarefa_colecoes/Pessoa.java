package tarefa_colecoes;

public class Pessoa {
	
	private String nome;
	private Character sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Pessoa(String nome, Character sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	
	
	public Pessoa(String dados) {
		String[] splitNomes = dados.split("; ");
		this.nome = splitNomes[0];
		this.sexo = splitNomes[1].charAt(0);
		
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
	}
		
}
