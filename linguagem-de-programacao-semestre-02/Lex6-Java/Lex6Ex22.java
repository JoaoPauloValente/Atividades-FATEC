
import java.util.Scanner;

public class Lex6Ex22 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int preco = 0;
		int cod = 0;
		int soma = 0;
		int maior = 0;
		int media;
		
		for(int i = 1; i <= 15; i++){
			
			System.out.println("Insira o código do " + i +"º" + "produto: ");
			cod = leia.nextInt();
			System.out.println("Insira o valor do produto: " + i +"º" + "produto: ");
			preco = leia.nextInt();
			
			soma += preco;
			
			if(preco > maior){
				
				maior = preco;
				
				
				}
					
			}
			
			media = soma/15;
				
			System.out.println("O maior preço é: " + maior);
			System.out.println("A média dos preços é: " + media);
			
			}
		
	}


