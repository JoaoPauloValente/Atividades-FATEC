
import java.util.Scanner;

public class Lex6Ex11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int alunosQtd;
		int notas = 0;
		int media;
	
		// Ler a quantidade de alunos
		
		System.out.println("Digite a quantidade de alunos: ");
		alunosQtd = leia.nextInt(); 
		
		//
		
		// Ler as notas dos alunos
		System.out.println("Digite as notas dos alunos: ");
		for(int i = 1; i <= alunosQtd; i++){
			
			notas += leia.nextInt();
			
			}
		//
		
		//realizar a média das notas
		media = notas / alunosQtd;
		
		//imprimir a média aritmética
		System.out.println("A média aritmética dos alunos é: " + media);
		
	}
}

