package metodocomarray;

import java.util.Scanner;

public class MetodoComArray {

    
    public static void main(String[] args) {
         
        int[][] matriz = new int[4][5]; 
        
        System.out.print("Entre com os valores da matriz: ");
        
        ler (matriz);
        
        imprimir (matriz);
        
    }
    
    static void ler (int matriz[][]){
        
        Scanner leia = new Scanner(System.in);
    
        for(int i = 0; i < matriz.length; i++){
            
            for(int j = 0; j<matriz[i].length; j++){
                
                System.out.println("Matriz [" + i + "] [" + j + "]" );
                matriz[i][j] = leia.nextInt();
                
            }
        
        }
    
    }
    
    static void imprimir (int matriz[][]){
    
         for(int i = 0; i < matriz.length; i++){
            
            for(int j = 0; j<matriz[i].length; j++){
                
                System.out.print(matriz[i][j] + " ");   
                
            }
            System.out.println();
        }
    
    }
            
            
    
}
