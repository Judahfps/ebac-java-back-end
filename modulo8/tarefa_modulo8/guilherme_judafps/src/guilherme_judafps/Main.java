package guilherme_judafps;

public class Main {

	public static void main(String[] args) {
		CalculoMedia media = new CalculoMedia(7.5, 10.0, 6.5, 9.5);
		
		System.out.printf("A sua Média é %.2f:%n ", media.getMedia());

	}

}
