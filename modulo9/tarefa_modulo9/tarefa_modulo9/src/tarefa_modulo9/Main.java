package tarefa_modulo9;

import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String linha = "-=".repeat(15);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println(linha);
		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextDouble();
		System.out.println(linha);
		System.out.println("Digite a terceira nota:");
		double nota3 = sc.nextDouble();
		System.out.println(linha);
		System.out.println("Digite a quarta nota:");
		double nota4 = sc.nextDouble();
		
		CalculoMedia.CalculoMedia(nota1, nota2, nota3, nota4);
		
		
		sc.close();
		
	}

}
