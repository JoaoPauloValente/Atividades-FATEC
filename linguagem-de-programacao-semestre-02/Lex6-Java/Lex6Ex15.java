
import java.util.Scanner;

public class Lex6Ex15 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2;
		int soma = 0;
		int aux = 0;
		
		System.out.println("Digite dois valores: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		
			
		if(n1 < n2){
			
			for(int i = n1; i <= n2; i++){
				
				soma += i;
				
				}
			
			System.out.println("A soma dos numeros entre " + n1 + " e " + n2 + " é " + soma);
			
		}else{
			aux = n1;
			n1 = n2;
			n2 = aux;
			
			for(int i = n1; i <= n2; i++){
				
				soma += i;
				
				}
			
			System.out.println("A soma dos numeros entre " + n1 + " e " + n2 + " é " + soma);
			
			}
		}
}

