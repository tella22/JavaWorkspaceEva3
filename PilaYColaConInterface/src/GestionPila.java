
public class GestionPila {
	public static void main(String args[]) {
		ColaDinamica colaDinamica1 = new ColaDinamica(5);
		ColaDinamica colaDinamica2 = new ColaDinamica(8);

		// apilamos unos numeros
		for(int i=0; i<5; i++) colaDinamica1.add(i);
		for(int i=0; i<8; i++) colaDinamica2.add(i);

		// los desapilamos
		System.out.println("Cola dinamica 1:");
	    System.out.println("----------------");
		for(int i=0; i<5; i++) System.out.println(colaDinamica1.delete());

		System.out.println("Cola dinamica 2:");
	    System.out.println("----------------");
		for(int i=0; i<8; i++) System.out.println(colaDinamica2.delete());
		
		PilaDinamica pilaDinamica1 = new PilaDinamica(5);
		PilaDinamica pilaDinamica2 = new PilaDinamica(8);
		
		for(int i=0; i<12; i++){
			pilaDinamica1.add(i);
		}
		
	    for(int i=0; i<20; i++){
	    	pilaDinamica2.add(i);
	    }
	    
	    System.out.println("Pila pilaDinamica1:");
	    System.out.println("-------------------");
	    
	    for(int i=0; i<12; i++) {
	       System.out.println(pilaDinamica1.delete());
	    }
	    
	    System.out.println("Pila pilaDinamica2:");
	    System.out.println("-------------------");
	    
	    for(int i=0; i<20; i++){ 
	       System.out.println(pilaDinamica2.delete());
	    }
	    
	    // utilizamos una variable de tipo IpilaDeEnteros para guardar tanto la pila fija como la dinámica
	    
	    Dinamizable pila;
	    PilaDinamica pilaDinamica = new PilaDinamica(5);
	    ColaDinamica colaDinamica = new ColaDinamica(8);
	    
	    pila = pilaDinamica; // apunta a la pila dinamica
	    // apilamos unos cuantos numeros
	    for(int i=0; i<12; i++) pila.add(i);
	    
	    pila = colaDinamica; // apunta a la pila fija
	    // apilamos unos cuantos numeros
	    for(int i=0; i<8; i++) pila.add(i);
	    
	    pila = pilaDinamica; // apunta a la pila dinamica
	    System.out.println("\nValores en pila dinamica:");
	    System.out.println("--------------------------:");
	    
	    for(int i=0; i<12; i++) 
	        System.out.println(pila.delete());
	    
	    pila = colaDinamica; // apunta a la cola dinamica
	    System.out.println("\nValores en cola dinamica:");
	    System.out.println("--------------------------:");
	    
		for(int i=0; i<8; i++) System.out.println(pila.delete());
	}// main
}
