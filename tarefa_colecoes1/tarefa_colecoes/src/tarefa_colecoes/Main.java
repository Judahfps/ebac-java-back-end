package tarefa_colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *  Ler os nomes no console: Você vai ler uma linha de input que contém os nomes separados por vírgulas.
    Separar por vírgulas: Utilize o método split(",") na string lida para dividir os nomes sempre que encontrar uma vírgula.
    Armazenar na variável: As substrings resultantes do split serão armazenadas em um array ou em outra estrutura de dados adequada, como uma lista (List<String>).
    Ordenar por ordem alfabética: Utilize métodos de ordenação da coleção, como Collections.sort() para ordenar os nomes em ordem alfabética.
    Imprimir na tela: Após ordenar, você pode imprimir os nomes na tela usando um loop ou método de impressão apropriado.
    
    Ler nomes e sexo: Para a segunda parte da tarefa, após ler os nomes, você pode adaptar o uso do split para também separar o sexo (se for o caso),
    utilizando um delimitador adicional ou um padrão no input.
    Separar por grupo de gênero: Após separar por sexo, você pode agrupar os nomes por gênero usando estruturas de dados como Map<String, List<String>>,
    onde a chave pode ser "Masculino" e "Feminino", por exemplo.
    Subir no Git: Finalmente, você deve subir seu código, incluindo a implementação do split e todas as funcionalidades descritas, para um repositório Git.

Boa tarefa!
 */
import java.util.Scanner;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linha = "=-".repeat(25);
        
        String nomes = "Guilherme, Pedro, Maria, João, Debora";
        
        String[]arraySplit = nomes.split(", ");
        
        System.out.println("Lista quebrada na virgula:");
        for(int i=0; i<arraySplit.length; i++) {
        	System.out.println(arraySplit[i]);
        }
       System.out.println(linha);
        System.out.println("Ordenando em ordem alfabética:");
        List<String> listaOrdenada = new ArrayList<>();
        for(int i=0; i<arraySplit.length; i++) {
        	listaOrdenada.add(arraySplit[i]);
        }
        //Ordenando a Lista em ordem alfabética
        Collections.sort(listaOrdenada);
        System.out.println(listaOrdenada);
        
        
        String stringNomes = "Guilherme;M, Maria;F, Pedro;M, Sarah;F";
        String[] stringNomesSplit = stringNomes.split(", "); 
        List<String> novaListaSplit = new ArrayList<>();
        for(int i=0; i<stringNomesSplit.length; i++) {
        	String[] partes = stringNomesSplit[i].split(";");
        	for(int j=0; j<partes.length; j++) {
        		novaListaSplit.add(partes[j]);
        	}
        }
        System.out.println(linha);
        System.out.println("Dados da novaListaSplit:");
        for(String dados : novaListaSplit) {
        	System.out.println(dados);
        }
        
        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();
        
        for(int i=0; i<novaListaSplit.size(); i+=2) {
        	String nome = novaListaSplit.get(i);
        	String sexo = novaListaSplit.get(i + 1);
        	
        	if(sexo.equals("M")) {
        		homens.add(nome);
        	}
        	else if(sexo.equals("F")) {
        		mulheres.add(nome);
        	}
        }
       
        System.out.println(linha);
        System.out.println("Dados separados por Sexo");
        System.out.println("Homens: " + homens);
        System.out.println("Mulheres: " + mulheres);
        
        
        sc.close();
    }
}
