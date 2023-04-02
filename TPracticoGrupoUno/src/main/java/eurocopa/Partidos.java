package eurocopa;
// faltaban completar los set. Corregí el resultado para que use enum
public class Partidos {
   private Equipos equipo1;
   private Equipos equipo2;
   private int golesEquipo1;
   private int golesEquipo2;
public void Partidos(Equipos equipo1, Equipos equipo2, int golesEquipo1, int golesEquipo2){
   this.equipo1 = equipo1;
   this.equipo2=equipo2;
   this.golesEquipo1=golesEquipo1;
   this.golesEquipo2=golesEquipo2;

     }
   public Equipos getequipo1() {
   return equipo1;
   }

    public void setEquipo1(Equipos equipo1) {
        this.equipo1 = equipo1;
    }
    public Equipos getequipo2 () {
   return equipo2;
    }

    public void setEquipo2(Equipos equipo2) {
        this.equipo2 = equipo2;
    }
    public int getgolesEquipo1() {
   return golesEquipo1;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }
    public int getGolesEquipo2() {
      return golesEquipo2;
   }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public ResultadoEnum resultado(Equipos equipox){
    //recibo un equipo y consigno el resultado

     if (equipo1.getNombre() == equipox.getNombre()) {
         if (golesEquipo1 > golesEquipo2) {
             //local ganador
             return ResultadoEnum.Ganador;
         } else {
             if (golesEquipo1 == golesEquipo2) {
                 //empate
                 return ResultadoEnum.Empate;
             } else {
                 //local perdedor
                 return ResultadoEnum.Perdedor;
             }

         }
     } else if (equipo2.getNombre() == equipox.getNombre()) {
         if (golesEquipo2 < golesEquipo1) {
             //visitante perdedor
             return ResultadoEnum.Perdedor;
         } else {
             if (golesEquipo2 == golesEquipo1) {
                 //empate
                 return ResultadoEnum.Empate;
             } else {
                 //visitante ganador
                 return ResultadoEnum.Ganador;
             }

         }
     }
     return null;
    }

}
