
public class ListaVaciaException extends RuntimeException{
	 // constructor
	   public ListaVaciaException()
	   {
	      this( "Lista" ); // llama al otro constructor de ListaVaciaException
	   } // constructor

	   
	   public ListaVaciaException( String nombre )
	   {
	      super( nombre + " esta vacia" ); // llama al constructor de la superclase
	   } // constructor
}
