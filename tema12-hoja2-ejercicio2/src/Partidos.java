
public class Partidos {

	private String nombre;
	private Integer votos;
	private Integer escaños=0;
	
	public Integer getEscaños() {
		return escaños;
	}

	public void addEscaños() {
		this.escaños++;
	}

	public Partidos(String nombre, Integer votos) {
		this.nombre = nombre;
		this.votos = votos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}
	
}
