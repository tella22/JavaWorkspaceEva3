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

		Integer length = (int)(Math.random() * (15-1+1) + (1));
		ArrayList<Integer> lista = new ArrayList<>();

		LinkedList<Integer> objetoLinked = new LinkedList<>();	
		
		for (int i = 0; i < length; i++) {
			lista.add((int)(Math.random() * (15-1+1)+1));
		}
		
		for (Integer i: lista) {
			objetoLinked.add(i);
		}
		
		Leer.mostrarEnPantalla("\n Elementos del ArrayList ");
		Leer.mostrarEnPantalla("_______________________________________________________________");
		for (Integer i: lista) {
			System.out.print(" " + i + " *");
		}
		Leer.mostrarEnPantalla("\n_______________________________________________________________");
		
		
		Leer.mostrarEnPantalla("\n Elementos del Linked ");
		Leer.mostrarEnPantalla("_______________________________________________________________");
		for (Integer i: objetoLinked) {
			System.out.print(" " + i + " *");
		}
		Leer.mostrarEnPantalla("\n_______________________________________________________________");
		
		System.out.println("Valores de Arraylist: " + lista);
		System.out.println("Valores de objetoLinked: " + objetoLinked);
		
	}

}
