

public class testeOperadorNot{
	
	public static void main (String[] args) {
		boolean ok = true;
		
		System.out.println( ok );
		System.out.println( !ok );
		System.out.println( !!(5>7));
		
		System.out.println("\n=======================\n incremento pré-fixado \n=======================\n ");
		
		//incremento pré-fixado
		int x = 0;
		int y = 0;
		
		System.out.println("x = 0; // " + x);
		
		++x;
		System.out.println( "++x; // " + x );
		
		y = ++x;
		System.out.println( "y = ++x; // x=" + x + "\n\t// y=" + y);
		
		System.out.println("\n=======================\n incremento pós-fixado \n=======================\n ");
		
		//incremento pós-fixado
		x = 0;
		
		
		System.out.println( "x = 0; // " + x);
		
		x++;
		System.out.println( "x++; // " + x );
		
		y = x++;
		System.out.println( "y = x++; // x=" + x + "\n\t// y=" + y);
		
		System.out.println("\n=======================\n decremento pré-fixado \n=======================\n ");
		
		//decremento pré-fixado
		x = 0;
		y = 0;
		
		System.out.println("x = 0; // " + x);
		
		--x;
		System.out.println( "--x; // " + x );
		
		y = --x;
		System.out.println( "y = --x; // x=" + x + "\n\t// y=" + y);
		
		System.out.println("\n=======================\n decremento pós-fixado \n=======================\n ");
		
		//decremento pós-fixado
		x = 0;
		
		
		System.out.println( "x = 0; // " + x);
		
		x--;
		System.out.println( "x--; // " + x );
		
		y = x--;
		System.out.println( "y = x--; // x=" + x + "\n\t// y=" + y);
		
		
		
	}
}

