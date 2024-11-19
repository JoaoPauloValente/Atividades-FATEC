
import java.util.Random;

public class Lex6Ex20 {
	
	public static void main (String[] args) {
		
		Random num = new Random();
		 
		int valorAleatorio;
		int maior = 0;
		int menor = 1000000;
		
		for(int i = 1; i <= 10; i++){
			
			valorAleatorio = num.nextInt(1000) + 1;
			System.out.println(valorAleatorio);
			
			if(valorAleatorio > maior){
				
			maior = valorAleatorio;
				
			} 
			
			if(valorAleatorio < menor){
				
			menor = valorAleatorio;
			
			}		
			
		
		}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		
		
}
}

