package eurocopa;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;




public class EurocopaMain {
  
	public static void main(String[] args) {
//LEEMOS LOS RESULTADOS
  Collection <Partidos> partidos= new ArrayList <Partidos> ();
    	Path pathResultados = Paths.get("src/test/resources/resultados de partidos jugados.csv" );
    List<String> lineasResultados=null;
	try {
		lineasResultados = Files.readAllLines (pathResultados);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println ("no se puede leer");
		System.out.println(e.getMessage());
		System.exit(1);
	}
    boolean primera=true;
    for(String lineaResultado:lineasResultados){
    	if (primera) {
			primera = false;
		} else {
		   //Aca leemos las lineas de partidos, España,3,4,Alemania
			//(ojo que el campo 0 lleva el numero de ronda)
			
			String[] campos = lineaResultado.split(",");
			Equipos equipo1 = new Equipos(campos[1]);
			Equipos equipo2 = new Equipos(campos[4]);
			Partidos partido = new Partidos(equipo1, equipo2);
			partido.setGolesEq1(Integer.parseInt(campos[2]));
			partido.setGolesEq2(Integer.parseInt(campos[3]));
		     partidos.add(partido);
		}
	System.out.println (lineaResultado);}

   

 // Leemos pronosticos de participantes 
    int puntos = 0;
	Path pathApuestas= Paths.get ("src/test/resources/pronosticos de participantes.csv");
	List <String> lineasApuestas = null; 
	
	try {
		lineasApuestas = Files.readAllLines (pathApuestas);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println ("no se puede leer");
		System.exit(1);		
	}
	for (String lineaApuesta:lineasApuestas) {
   System.out.println (lineaApuesta);
	}	
	
	  // vamos a calcular los puntos
	
	 puntos = 0; // total puntos por persona
	Path pathPronostico = Paths.get("src/test/resources/pronosticos de participantes.csv");
	List<String> lineasPronostico = null;
	try {
		lineasPronostico = Files.readAllLines(pathPronostico);
	} catch (IOException e) {
		System.out.println("No se pudo leer la linea de pronosticos...");
		System.out.println(e.getMessage());
		System.exit(1);
	}
	primera = true;
	for (String lineaPronostico : lineasPronostico) {
		if (primera) {
			primera = false;
		} else {
			String[] campos = lineaPronostico.split(",");
			Equipos equipo1 = new Equipos(campos[1]);
			Equipos equipo2 = new Equipos(campos[5]);
			Partidos partido = null;

			for (Partidos partidoCol : partidos) {
				if (partidoCol.getEquipo1().getNombre(
						).equals(equipo1.getNombre())
						&& partidoCol.getEquipo2().getNombre(
								).equals(equipo2.getNombre())) {
					
					partido = partidoCol;
					
				}
			}
			Equipos equipo = null;
			 EnumResultado resultado = null;
			if("X".equals(campos[2])) {
				equipo = equipo1;
				resultado = EnumResultado.GANADOR;
			}
			if("X".equals(campos[3])) {
				equipo = equipo1;
				resultado = EnumResultado.EMPATE;
			}
			if("X".equals(campos[4])) {
				equipo = equipo1;
				resultado = EnumResultado.PERDEDOR;
			}
			Pronostico pronostico = new Pronostico(partido,equipo,  resultado);
			// sumar los puntos correspondientes
			puntos += pronostico.puntos();
		}
	}

	// mostrar los puntos
	System.out.println("Los puntos obtenidos por el usuario fueron:");
	System.out.println(puntos);

}
}

	
