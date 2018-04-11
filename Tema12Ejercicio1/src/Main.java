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

		Integer length = (int) (Math.random() * (15-1+1)+1);
		ArrayList<Integer> lista = new ArrayList<>();

		HashSet<Integer> objetoHash = new HashSet<>();
		LinkedHashSet<Integer> objetoLinked = new LinkedHashSet<>();
		TreeSet<Integer> objetoTree = new TreeSet<>();
		
		for (int i = 0; i < length; i++) {
			lista.add((int)(Math.random() * (8000-1000+1)+1000));
		}		
		
		Leer.mostrarEnPantalla("Elementos de la lista");
		Leer.mostrarEnPantalla("_____________________");
		for (Integer i: lista) {
			System.out.print(" " + i.toString());
		}
		Leer.mostrarEnPantalla("\n_____________________");
		
		for (Integer i: lista) {
			objetoHash.add(i);
			objetoLinked.add(i);
			objetoTree.add(i);
		}
		
		Leer.mostrarEnPantalla(" Elementos del Hash  ");
		Leer.mostrarEnPantalla("_____________________");
		for (Integer i: objetoHash) {
			System.out.print(" " + i);
		}
		Leer.mostrarEnPantalla("\n_____________________");
		
		Leer.mostrarEnPantalla(" Elementos del Linked  ");
		Leer.mostrarEnPantalla("_____________________");
		for (Integer i: objetoLinked) {
			System.out.print(" " + i);
		}
		Leer.mostrarEnPantalla("\n_____________________");
		
		Leer.mostrarEnPantalla(" Elementos del Tree  ");
		Leer.mostrarEnPantalla("_____________________");
		for (Integer i: objetoTree ) {
			System.out.print(" " + i);
		}
		Leer.mostrarEnPantalla("\n_____________________");
		
		System.out.println("Valores de objetoHash: " + objetoHash);
		System.out.println("Valores de objetoLinked: " + objetoLinked);
		System.out.println("Valores de objetoTree: " + objetoTree);
		
	}

}
