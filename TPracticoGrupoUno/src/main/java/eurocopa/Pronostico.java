package eurocopa;



public class Pronostico {
	
	private Partidos partido;
	private Equipos equipo;
	private EnumResultado  resultado;


	public Pronostico(Partidos partido, Equipos equipo, EnumResultado resultado) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
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

