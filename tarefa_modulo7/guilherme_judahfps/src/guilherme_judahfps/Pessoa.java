package guilherme_judahfps;
/**
 * CRIAMOS UMA CLASSE PESSOA, COM SEUS STRIBUTOS, E GERAMOS OS METODOS GET E SETS PARA ACESSAR ESSE ATRIBUTOS, QUANDO A CLASS
 * FOR INSTANCIADA.
 */
public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private String cidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	

}
