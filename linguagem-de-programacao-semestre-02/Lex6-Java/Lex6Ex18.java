
import java.util.Scanner;

public class Lex6Ex18 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
			int totalEstoque, valorMercadorias, valorTotalEstoque, mediaDePreco;
			valorMercadorias = 0;
			
			System.out.println("Insira a quantidade de produtos em estoque: ");
			totalEstoque = leia.nextInt();
			
			
			for(int i = 1; i <= totalEstoque; i++){
			System.out.println("Insira o preço do produto Nº" + i);
			valorMercadorias += leia.nextInt();
			
			}
		
			valorTotalEstoque = valorMercadorias;
			mediaDePreco = valorTotalEstoque / totalEstoque;
			
			System.out.println("O valor total em estoque é de R$" + valorTotalEstoque);
			System.out.println("A média de valores dos produtos em estoque é de R$" + mediaDePreco);
	}
}

