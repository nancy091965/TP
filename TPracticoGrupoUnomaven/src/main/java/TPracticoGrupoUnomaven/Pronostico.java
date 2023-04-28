package TPracticoGrupoUnomaven;



public class Pronostico {
	
	private Partidos partido;
	private Equipos equipo;
	private EnumResultado  resultado;
	private String participante;


	public Pronostico(String participante, Partidos partido, Equipos equipo, EnumResultado resultado) {
		super();
		this.participante = participante;
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}
			
	public String getParticipante() {
		return participante;
	}
	
	public Partidos getPartido() {
		return partido;
	}

	public Equipos getEquipo() {
		return equipo;
	}

	public EnumResultado getResultado() {
		return resultado;
	}

	public int puntos() {
		//resultado=apuesta
		EnumResultado resultadoReal=partido.resultado (this.equipo);
		
	  if (this.resultado.equals(resultadoReal)) {
		  return 1;
	  }else	 {
		   
	return 0;
		}

	}
}

