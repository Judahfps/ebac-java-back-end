package tarefa_colecoes;

import java.util.Objects;

public class Cadastro implements Comparable<Cadastro> {
	private String  nome;
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
	
	public Cadastro(String nome, Character sexo) {
		this.nome = nome;
		this.sexo = sexo;
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, sexo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
	}
	
	@Override
	public String toString() {
		return "Cadastro [nome = " + nome + ", sexo = " + sexo + "]";
	}
	
	@Override
	public int compareTo(Cadastro other) {
		return this.nome.compareTo(other.nome);
		
	}

}




