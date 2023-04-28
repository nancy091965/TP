package TPracticoGrupoUnomaven;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EurocopaTest {
	
	@Test
	
	public void sinPuntos() {
		Participantes participante1 = new Participantes ("P1", "Sin", "puntos");
		//assertEquals(0, participante1.getIdPuntos());
		//AssertEquals(0, participante1.getIdPuntos());
		assertEquals("Sin puntos", participante1.getNombre()+ " " +participante1.getApellido());
		
	}
	@Test
	public void testPartidoresult() {
		Equipos equipo1 = new Equipos ("Boca Juniors");
		equipo1.setId(1);
		equipo1.setDescripcion("El mejor de Argentina");
		
		Equipos equipo2 = new Equipos ("River Plate");
		equipo2.setId(2);
		equipo2.setDescripcion("Lastimosos descendidos");
		
		Partidos partido = new Partidos (equipo1, equipo2);
		partido.setGolesEq1(5);
		partido.setGolesEq2(0);
		
		assertEquals("GANADOR: Boca Juniors El mejor de Argentina", partido.resultado(equipo1) + ": " + partido.getEquipo1().getNombre() + " " + equipo1.getDescripcion());
		
	}
	
	// resultados todo bien
	
	// resultados ningun ganador

}
