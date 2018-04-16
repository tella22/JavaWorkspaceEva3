import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Integer totalEscanyos;
		Integer totalPartidos;
		Integer porcentajeMin;

		TreeMap<Integer, LinkedList<Partidos>> treeVotos = new TreeMap<>(Collections.reverseOrder());

		totalPartidos = Leer.pedirEntero("Introduce el total de partidos");
		totalEscanyos = Leer.pedirEntero("Introduce el total de escaños");
		porcentajeMin = Leer.pedirEntero("Introduce el porcentaje minimo de votos");

		Partidos vPartidos[] = new Partidos[totalPartidos];

		calcularVotos(treeVotos, vPartidos, totalEscanyos, totalPartidos, porcentajeMin);
		calcularEscanyos(treeVotos, totalEscanyos);
		podar(treeVotos);

		mostrarPartidosVotos(vPartidos);
		mostrarEscanyos(vPartidos);
		
	}

	private static void calcularVotos(TreeMap<Integer, LinkedList<Partidos>> treeVotos,
		Partidos[] vPartidos, Integer totalEscanyos, Integer totalPartidos, Integer porcentajeMin) {
		Integer totalVotos = 0;
		Integer votos;
		Partidos pPartido = null;
		Integer totalVotosMin = null;
		

		for (Integer i = 0; i < totalPartidos; i++) {
			votos = (int) Math.floor(Math.random() * (30000 - 50 + 1) + (50));
			pPartido = new Partidos("Partido " + (i + 1), votos);
			totalVotos += votos;

			vPartidos[i] = pPartido;
			for (Integer j = 1; j <= totalEscanyos; j++) {
				if (treeVotos.get((votos / j)) == null) {
					treeVotos.put((votos / j), new LinkedList<>());
				}
				treeVotos.get((votos / j)).add(pPartido);
			}
		}
		
		totalVotosMin = totalVotos * porcentajeMin / 100;
		
		for (Partidos partido: vPartidos) {
			if (partido.getVotos() <= totalVotosMin) {
				for (Integer key : treeVotos.keySet()) {
					treeVotos.get(key).remove(partido);
				}
			}
		}
	}

	private static void calcularEscanyos(TreeMap<Integer, LinkedList<Partidos>> treeVotos, Integer totalEscanyos) {
		LinkedList<Partidos> pPartido;
		String pNombre;

		Integer contaEscanyos = 0;
		Integer pEscanyos;

		for (Integer votos : treeVotos.keySet()) {
			if (contaEscanyos < totalEscanyos) {
					for (Partidos partidos: treeVotos.get(votos)) {
						pNombre = partidos.getNombre();
						pEscanyos = votos;

						contaEscanyos++;
						partidos.addEscanyos();
					}
			}else {
				break;
			}

		}
	}

	private static void mostrarPartidosVotos(Partidos[] vPartidos) {
		String partidosMostrar = "\nPARTIDOS\tVOTOS";
		String pNombre;
		Integer pVotos;
		Leer.mostrarEnPantalla(partidosMostrar);
		for (Partidos partido : vPartidos) {
			pNombre = partido.getNombre();
			pVotos = partido.getVotos();
			// pEscanyos = par
			Leer.mostrarEnPantalla(pNombre + "\t" + pVotos);
		}
	}

	private static void mostrarEscanyos(Partidos[] vPartidos) {
		String pNombre;
		String escanyosMostrar = "\nPARTIDOS\tESCAÑOS";
		Integer pEscanyos;
		Leer.mostrarEnPantalla(escanyosMostrar);
		for (Partidos partido : vPartidos) {
			pNombre = partido.getNombre();
			pEscanyos = partido.getEscanyos();

			Leer.mostrarEnPantalla(pNombre + "\t" + pEscanyos);
		}
	}
	
	private static Integer podar(TreeMap<Integer, LinkedList<Partidos>> treeVotos) {
		for (Integer key: new TreeMap<Integer, LinkedList<Partidos>>(treeVotos).keySet()) {
			if (treeVotos.get(key).size() == 0) {
				treeVotos.remove(key);
				System.out.println("Arbol optimizado!");
				
			}
		}
		
		return null;
	}

}
