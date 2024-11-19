
import java.util.Scanner;

public class ExeRepeticao {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int valor, resultado;
		
		System.out.println("Entre com a tabuada: ");
		valor = leia.nextInt();
		
		for(int i = 1; i<=100; i++){
			
		resultado = valor*i;
		
		System.out.println("2 * " + i + " = " + resultado);
		}

		
	}
}

