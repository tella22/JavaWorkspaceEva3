import java.util.Collections;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {

		Integer totalVotos = 0;
		final Integer totalEscaños = 5;
		final Integer totalPartidos = 4;
		Integer votos;
		TreeMap<Integer, Partidos> treeVotos = new TreeMap<>(Collections.reverseOrder());
		Integer contaEscanyos=0;
		
		Partidos pPartido = null;
		String pNombre = null;
		Integer pVotos = null;
		Integer pEscanyos = null;
		String partidosMostrar ="PARTIDOS\tVOTOS";
		String escanyosMostrar ="PARTIDOS\tESCAÑOS";
		
		
		
		Partidos vPartidos[] = new Partidos[totalPartidos];
		
		
		totalVotos = calcularVotos(totalVotos, treeVotos, vPartidos);
		
		
		
		mostrarPartidosVotos(partidosMostrar, vPartidos);
		
		contaEscanyos = calcularEscaños(treeVotos, contaEscanyos);
		

		Leer.mostrarEnPantalla("");
		Leer.mostrarEnPantalla(escanyosMostrar);
		mostrarEscaños(vPartidos);	
		
	}

	private static void mostrarEscaños(Partidos[] vPartidos) {
		String pNombre;
		Integer pEscanyos;
		for (Partidos partido : vPartidos) {
			pNombre = partido.getNombre();
			pEscanyos = partido.getEscaños();
			
			Leer.mostrarEnPantalla(pNombre + "\t" + pEscanyos);
		}
	}

	private static Integer calcularEscaños(TreeMap<Integer, Partidos> treeVotos, Integer contaEscanyos) {
		Partidos pPartido;
		String pNombre;
		Integer pEscanyos;
		for (Integer escanyo: treeVotos.keySet()) {
			while(contaEscanyos < 5) {
				pPartido = treeVotos.get(escanyo); 
				pNombre = pPartido.getNombre();
				pEscanyos = escanyo;
				
//				Leer.mostrarEnPantalla(pNombre + "\t" + pEscanyos);
				contaEscanyos++;	
				pPartido.addEscaños();
				break;
			}
			
		}
		return contaEscanyos;
	}

	private static void mostrarPartidosVotos(String partidosMostrar, Partidos[] vPartidos) {
		String pNombre;
		Integer pVotos;
		Leer.mostrarEnPantalla(partidosMostrar);
		for (Partidos partido: vPartidos) {
			pNombre = partido.getNombre();
			pVotos = partido.getVotos();
			//pEscanyos = par 
			Leer.mostrarEnPantalla(pNombre + "\t" + pVotos);
		}
	}

	private static Integer calcularVotos(Integer totalVotos, TreeMap<Integer, Partidos> treeVotos,
			Partidos[] vPartidos) {
		Integer votos;
		Partidos pPartido;
		for (int i = 0; i < 4; i++) {
			votos=(int)Math.floor(Math.random()*(30000-10000+1)+(10000));
			totalVotos += votos;
			pPartido = new Partidos("Partido "+(i+1), votos);
			vPartidos[i] = pPartido;
			treeVotos.put(votos, pPartido);
			treeVotos.put(votos / 2, pPartido);
			treeVotos.put(votos / 3, pPartido);
			treeVotos.put(votos / 4, pPartido);
			treeVotos.put(votos / 5, pPartido);
		}
		return totalVotos;
	}

}
