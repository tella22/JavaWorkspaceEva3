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

		final String finalizar = "*";
		TreeSet<String> objetoTree = new TreeSet<>();	
		String introducir;
		int cont=0, num;
		
		do{
			introducir = Leer.pedirCadena("introduce una palabra");
			objetoTree.add(introducir);
		}while(! introducir.equals(finalizar));
		
		objetoTree.remove(finalizar);
		
		num = Leer.pedirEntero("introduce un numero que no sea mayor a " + (objetoTree.size()));
		
		Leer.mostrarEnPantalla("\n Elementos del Tree ");
		Leer.mostrarEnPantalla("___________________________");
		for (String i: objetoTree) {
			cont++;
			if(cont-1 < num) {
				System.out.print(" " + i + " *");
			}else {
				break;
			}
		}
		Leer.mostrarEnPantalla("\n_________________________");
		
//		System.out.println("Valores de objetoLinked: " + objetoTree);
	}

}
