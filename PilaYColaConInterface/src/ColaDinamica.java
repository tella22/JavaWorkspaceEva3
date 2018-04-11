import java.util.Arrays;

public class ColaDinamica implements Dinamizable{

	private Integer cola[];
	private Integer finalCola;

	ColaDinamica(Integer tamanioMax) {
		cola = new Integer[tamanioMax];
		finalCola = 0;
	}
	public void add(Integer elemento){ // apilar un elemento
		if(finalCola==cola.length){ // si esta llena la ampliamos
			cola = Arrays.copyOf(cola, (cola.length+1) );
			cola[finalCola] = elemento;
			finalCola++;
		}else{
			cola[finalCola] = elemento;
			finalCola++;
		}
	}

	public Integer delete(){ // desapilar un elemento
		if(finalCola == 0) {
			System.out.println("Pila vacía.");
			return 0;
		}
		else {
			Integer borrado = cola[0];
			Integer i=0;
			do {
				cola[i] = cola[i+1];
				i++;
			}while(i<finalCola-1);
			
			finalCola--;
			return borrado;
		}
	}
}