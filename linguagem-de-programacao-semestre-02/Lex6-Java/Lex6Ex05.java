
import java.util.Scanner;

public class Lex6Ex05 {
	
	public static void main (String[] args) {
	
	Scanner leia = new Scanner(System.in);
	Scanner leia2 = new Scanner(System.in);
	
	System.out.println("Entre com um valor: ");
	int n = leia.nextInt();
	
		if(n > 0){
			
			System.out.println("=====Valores de 1 até " + n + "=====");
			
			for(int i = 0; i <= n; i++){
				
				System.out.println(i);
				
				}
				
		}else{ 
			
			for(int i = 0; n < 0; i++){
				
				System.out.println("O valor é menor que 0 , digite um valor maior que 0");
			
					System.out.println("Entre com um valor: ");
					n = leia.nextInt();
				
				}
				
			}
			
				
			
		}
	
	}

