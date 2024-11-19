
import java.util.Scanner;

public class Lex6Ex07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um valor de 1 a 10");
		int valor = leia.nextInt();
		int multiplicacao;
		
		
		if(valor <=10 && valor >= 1){
		
			for(int i = 1; i <= 10; i++){
			
			multiplicacao = valor * i;
			System.out.println(valor + " x " + i + " = " + multiplicacao);
			}	
			
		}else{
			
			System.out.println("Número Inválido!!");
			
			}
		
	}
}

