
public class Partidos {

	private String nombre;
	private Integer votos;
	private Integer esca�os=0;
	
	public Integer getEsca�os() {
		return esca�os;
	}

	public void addEsca�os() {
		this.esca�os++;
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
