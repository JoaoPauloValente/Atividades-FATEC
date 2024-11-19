
import java.util.Scanner;

public class Lex6Ex21 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int qtd, soma, media;
		int maior = 0;
		int numeros = 0;
		soma = 0;
		
		System.out.println("Insira a quantidade de números a ser lida:");
		qtd = leia.nextInt();
		
		
		System.out.println("Insira os " + qtd + " números");
		for(int i = 1; i <= qtd; i++){
			
			numeros = leia.nextInt();
			soma += numeros;
			
			if(numeros > maior){
				
				maior = numeros;
				
				}
			
			
			
			}
			
		media = soma/qtd;
		
		System.out.println("A média dos números digitados é: " + media);
		System.out.println("O maior número é " + maior);
		
	}
}

