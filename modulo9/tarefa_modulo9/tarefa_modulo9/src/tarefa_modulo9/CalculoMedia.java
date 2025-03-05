package tarefa_modulo9;

public class CalculoMedia {
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public static void CalculoMedia(double nota1, double nota2, double nota3, double nota4) {
		double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
		System.out.printf("A sua Média é %.2f: ", media);
		System.out.println();
		if(media >= 7.0) {
			System.out.println("Aluno Aprovado!!!");
		}
		else if(media >= 5 && media < 7) {
			System.out.println("Aluno de Recuperação");
		}
		else {
			System.out.println("Aluno Reprovado");
		}
	}
	
	
}
