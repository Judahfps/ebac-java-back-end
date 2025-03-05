package guilherme_judahfps;

public class Main {

	public static void main(String[] args) {
		
		int number = 10;
		String linha = "=-".repeat(20);
		
		Integer intergeWrappers = number;
		
		double valor = 25.5;
		
		Double valorWrappers = valor;
		
		System.out.println("Valor int primitivo: " + number);
		System.out.println(linha);
		System.out.println("Valor com Casting para Wrappers: " + intergeWrappers);
		System.out.println(linha);
		System.out.println("Valor double Primitivo: " + valor);
		System.out.println(linha);
		System.out.println("Valor com Casting para wrappers: " + valorWrappers);
		

	}

}
