

import java.util.Scanner;

public class Lex6Ex13 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros = 0;
		int numerosMenores = 0;
		int soma;
		
		//Ler os números inseridos
		System.out.println("Digite 10 valores");
		for(int i = 1; i <= 10; i++){
			
			numeros = leia.nextInt();
			 
			//Verificando se os valores são menores que 40 e realizando a soma deles
			if(numeros < 40){
				
				numerosMenores += numeros;
				
				}
			
			}
			
			soma = numerosMenores;
			
		//imprimindo a soma dos valores menores que 40
		System.out.println("As soma dos valores menores que 40 que forem digitados é: " + soma);
		
	}
}

