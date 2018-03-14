
public class TestLista {

	public static void main(String[] args) {
		Lista lista = new Lista(); // crea el contenedor de Lista

		// inserta enteros en lista
		lista.insertarAlFrente( -1 );
		lista.imprimir();
		lista.insertarAlFrente( 0 );
		lista.imprimir();
		lista.insertarAlFinal( 1 );
		lista.imprimir();
		lista.insertarAlFinal( 5 );
		lista.imprimir();

		// elimina objetos de lista; imprime despu�s de cada eliminaci�n
		try
		{
			Object objetoEliminado = lista.borrarPrimero();
			System.out.printf( "%s eliminado\n", objetoEliminado );
			lista.imprimir();

			objetoEliminado = lista.borrarPrimero();
			System.out.printf( "%s eliminado\n", objetoEliminado );
			lista.imprimir();

			objetoEliminado = lista.borrarUltimo();
			System.out.printf( "%s eliminado\n", objetoEliminado );
			lista.imprimir();

			objetoEliminado = lista.borrarUltimo();
			System.out.printf( "%s eliminado\n", objetoEliminado );
			lista.imprimir();
		} // fin de try
		catch ( ListaVaciaException excepcionListaVacia )
		{
			excepcionListaVacia.printStackTrace();
		} // fin de catch

	}

}
