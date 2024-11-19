
import java.util.Scanner;

public class Lex6Ex17 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		
		int n1, n2;
		int soma;
		String menu;			
			
				do{
					
					System.out.println("Entre com a 1ª nota: ");
					n1 = leia.nextInt();
					System.out.println("Entre com a 2ª nota: ");
					n2 = leia.nextInt();
				
					if(n1 >= 0 && n1 <= 10 && n2 >= 0 && n2<= 10){
								
					soma = (n1 + n2)/2;
							
					System.out.println("A média final é : " + soma);		
					
					}
					
					System.out.println("NOVO CÁLCULO? (S/N)");
					menu = leiaStr.nextLine();
					
				}while(menu.equals("S"));
					
			
	}
}

