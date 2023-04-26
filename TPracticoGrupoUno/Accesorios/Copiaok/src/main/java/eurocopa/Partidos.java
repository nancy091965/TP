package eurocopa;

public class Partidos {

	private Equipos equipo1;
	private Equipos equipo2;
	private int golesEq1;
	private int golesEq2;
	
  public Partidos (Equipos equipo1, Equipos equipo2) { //Constructor

     
        this.equipo1=equipo1;
	    this.equipo2=equipo2;
	    this.golesEq1 = golesEq1;
		this.golesEq2 = golesEq2;	  
  }


public Equipos getEquipo1() {
	return equipo1;
}

public void setEquipo1(Equipos equipo1) {
	this.equipo1 = equipo1;
}

public Equipos getEquipo2() {
	return equipo2;
}

public void setEquipo2(Equipos equipo2) {
	this.equipo2 = equipo2;
}

public int getGolesEq1() {
	return golesEq1;
}

public void setGolesEq1(int golesEq1) {
	this.golesEq1 = golesEq1;
}

public int getGolesEq2() {
	return golesEq2;
}

public void setGolesEq2(int golesEq2) {
	this.golesEq2 = golesEq2;
}
  public EnumResultado  resultado(Equipos equipo) {
	 
  if (golesEq1==golesEq2) {
   return EnumResultado. EMPATE;
  }
  if (equipo.getNombre().equals(equipo1.getNombre())){
	  if (golesEq1>golesEq2) {
		  return EnumResultado. GANADOR;
	  } else {
		  return EnumResultado .PERDEDOR;
	  } 
  }else {
    if (golesEq2>golesEq1) {
	  return EnumResultado .GANADOR;
  } else {
	  return EnumResultado.PERDEDOR;
  
	  }
 
	}
	  }


  }