import java.util.Random;

public class ExibeNumeroAleatorio {
    
public static void main(String[] args) {
    
    Random aleatorio = new Random();
    double numeroAleatorio = aleatorio.nextDouble(100) + 1;
    System.out.println("Valor Gerado: " + numeroAleatorio);

}

}
