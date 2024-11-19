
import java.util.Scanner;

public class Lex6Ex12 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valores = 0;
		
		// Leitura dos 10 valores e a soma deles
		System.out.println("Insira 10 valore");
		for(int i = 1; i <= 10; i++){
			
			valores += leia.nextInt();
			
			}
		
		// Imprimindo a soma dos valores digitados
		System.out.println("A soma dos dos valores digitados é: " + valores);
	}
}

