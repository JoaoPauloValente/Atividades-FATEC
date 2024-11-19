

import java.util.Scanner;

public class Lex6Ex09 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valores;
		int intervalo = 0;
		int foraIntervalo = 0;
		
		System.out.println("Insira 10 valores:");
		
		for(int i = 1; i <= 10; i++){
			
			valores = leia.nextInt();
			
			if(valores >= 10 && valores <= 20){
			intervalo++;
			
			}else{
			
			foraIntervalo++;	
				
			}
		
			System.out.println("Valores entre 10 e 20: " + intervalo + " números." + "\n" + "Valores fora do intervalo: " + foraIntervalo + " números.");
		
		}
	}
}
		
		


