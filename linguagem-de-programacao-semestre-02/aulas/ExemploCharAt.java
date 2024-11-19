
public class ExemploCharAt {
	
	public static void main (String[] args) {
		
		
		String texto = "AlEx";
		
		String outroTexto = "AleX";
		
		System.out.println(texto);
		System.out.println(outroTexto);
		
		System.out.println(texto.compareTo(outroTexto));
		
		if( texto.compareTo(outroTexto) < 0 ){
			
			System.out.println( texto + " e " + outroTexto);
			
			}else if(texto.compareTo(outroTexto) > 0){
				
				System.out.println(outroTexto + " e " + texto);
				
				}else{
					
					System.out.println("São Iguais");
					
					}
	
			}
		}
			
		
		
		

