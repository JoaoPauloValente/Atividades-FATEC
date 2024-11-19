
import java.util.Scanner;

public class Lex6Ex19 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
			
			int totalEstoque, valorMercadorias, valorTotalEstoque, mediaDePreco;
			totalEstoque = 0;
			valorMercadorias = 0;
			
			String opcao;
					
			do{
				totalEstoque++;
				
				System.out.println("Insira o preço de produto Nº" + totalEstoque);
				valorMercadorias += leia.nextInt();
				mediaDePreco = valorMercadorias/totalEstoque;
				
				System.out.println("Total em estoque: " + totalEstoque);
				System.out.println("Valor total em Estoque: " + valorMercadorias);
				System.out.println("Média de Preço: " + mediaDePreco +"\n");
				
				System.out.println("MAIS MERCADORIAS? (S/N)");
				opcao = leiaStr.nextLine();
				
			}while(opcao.equals("S"));
			
		
		
	}
}

