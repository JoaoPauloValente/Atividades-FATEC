
import java.util.Scanner;

public class Lex6Ex08 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valores;
		int negativos = 0;
		
		System.out.println("Isira 10 valores: ");
		
		for(int i = 1; i <= 10; i++){
			
			valores = leia.nextInt();
			
			if(valores < 0){
				
				negativos++;
				
				}
			
			
			}
			
		System.out.println("Quantidade de valores negativos: " + negativos);
		
	}
}

