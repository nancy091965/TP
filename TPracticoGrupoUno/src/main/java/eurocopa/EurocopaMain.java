package eurocopa;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class EurocopaMain {
    

	public static void main(String[] args) {
//LEEMOS LOS RESULTADOS
    	
    	Path pathResultados = Paths.get("src/test/resources/resultados de partidos jugados.csv");
    List<String> lineasResultados=null;
	try {
		lineasResultados = Files.readAllLines (pathResultados);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println ("no se puede leer");
		System.exit(1);
	}
   
    for(String lineaResultado:lineasResultados){
    
	System.out.println (lineaResultado);}

   


// Leer pronostico
	
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
	// total puntos pesona

	}
}


