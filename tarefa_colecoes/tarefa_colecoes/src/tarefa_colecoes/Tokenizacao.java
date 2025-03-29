package tarefa_colecoes;

import java.util.ArrayList;
import java.util.List;

public class Tokenizacao {
	
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


	public Tokenizacao(String nome, Character sexo) {
		this.nome = nome;
		this.sexo = sexo;
		
		List<String> array = new ArrayList<String>();
		
		array.add(getNome());
	//	array.add(getIdade());
		
	}

}
