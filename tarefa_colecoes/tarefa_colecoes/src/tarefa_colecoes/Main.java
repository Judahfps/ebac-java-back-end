package tarefa_colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linha = "=-".repeat(25);
		
		char res = 'S';
		Set<Cadastro> cadastros = new HashSet<Cadastro>();
		
		while(res != 'N') {
			
			System.out.println("Digite seu nome:");
			String nome = sc.next();
			System.out.println("Digite seu sexo (F / M):");
			Character sexo = Character.toUpperCase(sc.next().charAt(0));
			
			Cadastro cadastro = new Cadastro(nome, sexo);
			cadastros.add(cadastro);	
			
			System.out.println("Deseja realizar outro cadastro (S / N)");
			res = Character.toUpperCase(sc.next().charAt(0));
		}
		
		List<Cadastro> array = new ArrayList<Cadastro>();
		
		System.out.println(linha);
		for(Cadastro cadastro : cadastros) {
			array.add(cadastro);
		}
		
		List<Cadastro> arraySplit = new ArrayList<>();
		for(Cadastro nome : array) {
			arraySplit = nome.split();
		}
	//	Set<Cadastro> cadastroOrdenado = new TreeSet<Cadastro>();
		//Adicionando elementos em cadastroOrdenado.
	//	for(Cadastro cadastro : cadastros) {
		//	cadastroOrdenado.add(cadastro);
	//	}
		
		System.out.println(linha);
	//	System.out.println("Ordenando em ordem alfabética:");
	//	for(Cadastro cadastro : cadastroOrdenado) {
	//		System.out.println(cadastro);
	//	}
		
				
		sc.close();
	}

}
