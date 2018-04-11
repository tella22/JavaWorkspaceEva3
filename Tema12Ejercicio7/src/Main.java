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
		TreeMap<String, Integer> mapa = new TreeMap<String, Integer>();
		
		do {
			apellido=Leer.pedirCadena("Introduce el apellido");
			nota=Leer.pedirEntero("Introduce la nota");
			if(nota.equals("*")) {
				break;
			}
			mapa.put(apellido, nota);
		}while(! apellido.equals("*"));
		
		mapa.remove("*");
		
		Set set = mapa.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	    	 Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("El apellido es: "+ mentry.getKey() + " & su nota es: ");
	         System.out.println(mentry.getValue());
	      }
		
	}

}
