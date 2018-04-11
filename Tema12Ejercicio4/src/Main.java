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

		String[] vecPalabras = {"perro", "coche", "casa", " moto", "gato", "teclado", "musica", "juego", "arma", "arco", "silla", "cama", " sofa", "raton", "gafas", "disco"};
		Integer length = (int)(Math.random() * (15-1+1) + (1));
		ArrayList<String> lista = new ArrayList<>();

		LinkedList<String> objetoLinked = new LinkedList<>();	
		
		for (int i = 0; i < length; i++) {
			lista.add(vecPalabras[(int)(Math.random() * (15-1+1)+1)]);
		}
		
		for (String i: lista) {
			objetoLinked.add(i);
		}
		
		Leer.mostrarEnPantalla("\n Elementos del ArrayList ");
		Leer.mostrarEnPantalla("_______________________________________________________________");
		for (String i: lista) {
			System.out.print(" " + i + " *");
		}
		Leer.mostrarEnPantalla("\n_______________________________________________________________");
		
		
		Leer.mostrarEnPantalla("\n Elementos del Linked ");
		Leer.mostrarEnPantalla("_______________________________________________________________");
		for (String i: objetoLinked) {
			System.out.print(" " + i + " *");
		}
		Leer.mostrarEnPantalla("\n_______________________________________________________________");
		
		System.out.println("Valores de Arraylist: " + lista);
		System.out.println("Valores de objetoLinked: " + objetoLinked);
		
	}

}
