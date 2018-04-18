import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		final Integer totalExamenes = 3;
		final Integer[][] maxNotaExamenes = {{0,10},{0,10},{0,10}};;
		
		final String vNombres[] = {"Jesus", "Rafa", "Eric", "German", "Pepe", "Luis", "Jose Antonio", "Agustin", "Raul", "Diego"};
		final String vApellidos[] = {"Moros", "Arcos", "Gale", "Guijarro", "Tejedor", "Sancho", "Tella", "Lopez", "Gargallo", "Martinez"};
		ArrayList<Alumno> aListAlumnos = new ArrayList<>();
		
		
		//m1
		for (String nombre : vNombres) {
			for (String apellido : vApellidos) {
				Alumno alumno = new Alumno();
				String[] notas = {(int) Math.random() * , , };
				
				alumno.setApellido(nombre);
				alumno.setApellido(apellido);
				
				
				aListAlumnos.add(alumno);
			}
		}
		
	}

}
