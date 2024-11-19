

import java.util.Scanner;

public class Lex6Ex10	 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valores = 0;
		int media;
		
		System.out.println("Digite as 10 notas: ");
		
		for(int i = 1; i <= 10; i++){
		
		valores += leia.nextInt();
		
		}
	
	media = valores / 10;
	
	
	System.out.println("A média aritmética é: " + media);
}
}

