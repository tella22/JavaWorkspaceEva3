import java.util.*;

/**
 * 
 */

/**
 * @author Tella
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String apellido = "";
		Integer nota;
		TreeMap<Integer, String> mapa = new TreeMap<Integer, String>();
		Scanner teclado = new Scanner(System.in);
				
		do {
			System.out.println("introduce la nota (* para salir)");
			nota=teclado.nextInt();
			if(nota.equals("*")) {
				break;
			}
			apellido=Leer.pedirCadena("Introduce el apellido");
			if(apellido.equals("*")) {
				break;
			}
			mapa.put(nota, apellido);
		}while(! apellido.equals("*"));
		
		mapa.remove("*");
		
		Set set = mapa.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	    	 Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("La nota es: "+ mentry.getKey() + " & pertenece al alumno con apellido: ");
	         System.out.println(mentry.getValue());
	      }
		
	}

}
