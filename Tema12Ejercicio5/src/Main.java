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

		final int finalizar = -9999;
		TreeSet<Integer> objetoTree = new TreeSet<>();	
		int introducir;
		
		do{
			introducir = Leer.pedirEntero("introduce un numero");
			objetoTree.add(introducir);
		}while(introducir != finalizar);
		
		objetoTree.remove(finalizar);
		
		Leer.mostrarEnPantalla("\n Elementos del Tree ");
		Leer.mostrarEnPantalla("___________________________");
		for (Integer i: objetoTree) {
			System.out.print(" " + i + " *");
		}
		Leer.mostrarEnPantalla("\n_________________________");
		
		System.out.println("Valores de objetoLinked: " + objetoTree);
	}

}
