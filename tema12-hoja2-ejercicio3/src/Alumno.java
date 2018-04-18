import java.util.ArrayList;

public class Alumno {
	private String nombre, apellido;
	private ArrayList<Float> vNotas = new ArrayList<>();
	
	public Alumno(String nombre, String apellido, ArrayList<Float> vNotas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.vNotas = vNotas;
	}
	public Alumno() {
		this.nombre = nombre;
		this.apellido = apellido;
		this.vNotas = vNotas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public ArrayList<Float> getvNotas() {
		return vNotas;
	}
	public void setvNotas(ArrayList<Float> vNotas) {
		this.vNotas = vNotas;
	}
}
