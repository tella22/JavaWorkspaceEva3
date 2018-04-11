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

		Integer length = 8;
		ArrayList<String> lista = new ArrayList<>(Arrays.asList("este", "montaña", "letra", "bajo", "frio", "bajo", "bajo", "aleatorio"));

		HashSet<String> objetoHash = new HashSet<>();
		LinkedHashSet<String> objetoLinked = new LinkedHashSet<>();
		TreeSet<String> objetoTree = new TreeSet<>();		
		
		Leer.mostrarEnPantalla("Elementos de la lista");
		Leer.mostrarEnPantalla("_____________________");
		for (String i: lista) {
			System.out.print(" " + i.toString());
		}
		Leer.mostrarEnPantalla("\n_____________________");
		
		for (String i: lista) {
			objetoHash.add(i);
			objetoLinked.add(i);
			objetoTree.add(i);
		}
		
		Leer.mostrarEnPantalla("\n Elementos del Hash (sin orden) ");
		Leer.mostrarEnPantalla("_______________________________________________________________");
		for (String i: objetoHash) {
			System.out.print(" " + i + " *");
		}
		Leer.mostrarEnPantalla("\n_______________________________________________________________");
		
		Leer.mostrarEnPantalla("\n Elementos del Linked (ordenado por orden de insercion) ");
		Leer.mostrarEnPantalla("_______________________________________________________________");
		for (String i: objetoLinked) {
			System.out.print(" " + i + " *");
		}
		Leer.mostrarEnPantalla("\n_______________________________________________________________");
		
		Leer.mostrarEnPantalla("\n Elementos del Tree (por orden alfabetico) ");
		Leer.mostrarEnPantalla("_______________________________________________________________");
		for (String i: objetoTree ) {
			System.out.print(" " + i + " *");
		}
		Leer.mostrarEnPantalla("\n_______________________________________________________________");
		
		System.out.println("Valores de objetoHash: " + objetoHash);
		System.out.println("Valores de objetoLinked: " + objetoLinked);
		System.out.println("Valores de objetoTree: " + objetoTree);
		
	}

}
