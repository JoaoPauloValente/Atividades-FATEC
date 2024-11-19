
import java.util.Scanner;

public class ExeSwitch02 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		double preco;
		int codigo;
		
		String origem;
		
		System.out.println("Entre com o preço do produto: ");
		preco = leia.nextDouble();
		
		System.out.println("Entre com o código do produto: ");
		codigo = leia.nextInt();
		
		
		
		switch(codigo){
			case 1:
			origem = "Norte";
			break;
			
			case 2:
			case 5:
			case 9:
			origem = "Sul";
			break;
			
			case 3:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			origem = "Leste";
			break;
			
			case 7:
			case 20:
			origem = "Oeste";
			break;
			
			default:
			origem = "Importado";
				
			}
		System.out.println("O valor do produto é: " + preco + "\n" + origem);
	}
}

