
import java.util.Scanner;

public class ExeSwitch {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner( System.in );
		Scanner leiaStr = new Scanner( System.in );
		
		int n1, n2;
		double resultado;
		String operacao;
		
		System.out.println("Entre com o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Entre com as operações [+ , -, *, /] ");
		operacao = leiaStr.nextLine();
		
		switch( operacao ){
			case ("+"):
			resultado =  n1 + n2;
			break;
			
			case ("-"):
			resultado =  n1 - n2;
			break;
			
			case ("*"):
			resultado =  n1 * n2;
			break;
			
			case ("/"):
			resultado =  (double) n1 / n2;
			break;
			
			default:
			System.out.println("Operação inválida");
			resultado = 0;
	}
	
	System.out.println("\nO resultado é: " + resultado);
}
}
	
		


