package eurocopa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import java.sql.Connection; 




public class EurocopaMain {
  
	public static void  main(String[] args) {
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
    	System.out.println (lineaResultado);
    }
    System.out.println("");
    
    //LECTURA DE PARTICIPANTES
    
    ArrayList <Participantes> partic= new ArrayList <Participantes> ();
	Path pathParticipantes = Paths.get("src/main/java/Participantes.csv" );
	List<String> lineasPartic=null;
	try {
		lineasPartic = Files.readAllLines (pathParticipantes);
	} catch (IOException e) {
	// TODO Auto-generated catch block
		System.out.println ("no se puede leer");
		System.out.println(e.getMessage());
		System.exit(1);
	}
	primera=true;
	for(String lineaPartic:lineasPartic){
		if (primera) {
			primera = false;
		} else {
	   //Aca leemos las lineas de Participantes

		
			String[] campos = lineaPartic.split(",");
			Participantes Part  = new Participantes(campos[0], campos[1], campos[2]);
			partic.add(Part);
			
		}
			
	}
	
	
    
    
    

 // Leemos pronosticos de participantes 
    
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
	
	System.out.println("");
	
	  // vamos a calcular los puntos
	
	 // total puntos por persona
	
	ArrayList <Pronostico> pron = new ArrayList <Pronostico> ();
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
			String idpartic = new String (campos[0]);
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
			
			Pronostico prona  = new Pronostico(idpartic, partido, equipo, resultado);
			pron.add(prona);
							
		}
		
	}
	for(int i=0; i<pron.size(); i++) {
		for (int j=0; j<partic.size(); j++) { 
	/*		System.out.println(pron.size() + " " +pron.get(i).puntos() + " " +
					pron.get(i).getParticipante() + " " + pron.get(i).getResultado());*/
			
			if(partic.get(j).getidParticipante().equals(pron.get(i).getParticipante())) { 
				int sum = partic.get(j).getIdPuntos() + pron.get(i).puntos();
				partic.get(j).setIdPuntos(sum);
			}
				
		}
	}
	
	/*String nombreParticipante = campos[5];
	if(puntosParticipante.containsKey(
			nombreParticipante)) {
		puntosParticipante.put(nombreParticipante,
			puntosParticipante.get(
					nombreParticipante)
			+
			pronostico.puntos()
			)	;
	} else {
		puntosParticipante.put(nombreParticipante,
				pronostico.puntos());*/

	// mostrar los puntos
	
	for (int j=0; j<partic.size(); j++) { 
		System.out.println("Los puntos obtenidos por " +  partic.get(j).getNombre()+ " " +
				partic.get(j).getApellido() + " (" + partic.get(j).getidParticipante() + ") fueron: " + partic.get(j).getIdPuntos());
		 
		}
	
	System.out.println("\n Esta es la lista de participantes para una futura versión. Descargada de una base SQL en servidor propio\n");
	
	String servidor = "www.educando.net.ar:3306"; 
	String baseDatos = "vpvejznx_ariatech";
	String usuario = "vpvejznx_argentina-programa";
	String clave = "Estoesunabddeprueba!";
	String url = "jdbc:mysql://" + servidor + "/" +baseDatos+
			"?serverTimezone=America/Argentina/Buenos_Aires";
	
	java.sql.Connection cnx=null;
	try
	{
		cnx = java.sql.DriverManager.getConnection(url, usuario, clave);
		java.sql.Statement stmt = cnx.createStatement();
		// Se prepara el string SQL de la consulta
		String sql = "SELECT apellido, nombre  FROM Participantes";
		// Se ejecuta la sentencia y se recibe un resultado
		java.sql.ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
		String apellido = rs.getString("apellido");
		String nombre = rs.getString("nombre");
		System.out.println("nombre: " + nombre +" "+apellido);
		}
		rs.close();
		stmt.close();
	}
	catch (java.sql.SQLException ex)
	{
		System.out.println("SQLException: " + ex.getMessage());
		System.out.println("SQLState: " + ex.getSQLState());
		System.out.println("VendorError: " + ex.getErrorCode());
	}


}
}

	
