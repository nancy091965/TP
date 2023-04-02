package eurocopa;

public class Partidos {
   Equipos equipo1;
   Equipos equipo2;
   int golesEquipo1;
   int golesEquipo2;
public void Partidos(Equipos eq1, Equipos eq2, int golesEq1, int golesEq2){
   equipo1 = eq1;
   equipo2 = eq2;
   golesEquipo1 = golesEq1;
   golesEquipo2 = golesEq2;

     }
   public Equipos getequipo1() {
   return equipo1;
   }
public Equipos getequipo2 () {
   return equipo2;
    }
 public int getgolesEquipo1() {
   return golesEquipo1;
    }
   public int getGolesEquipo2() {
      return golesEquipo2;
   }
 public ResultadoEnum resultado(Equipos equipox){
    //recibo un equipo y consigno el resultado

     if (equipo1.getNombre() == equipox.getNombre()) {
         if (golesEquipo2 > golesEquipo1) {
             //perdedor
             return new ResultadoEnum();
         } else {
             if (golesEquipo2 == golesEquipo1) {
                 //empate
                 return new ResultadoEnum();
             } else {
                 //ganador
                 return new ResultadoEnum();
             }

         }
     } else if (equipo2.getNombre() == equipox.getNombre()) {
         if (golesEquipo2 < golesEquipo1) {
             //perdedor
             return new ResultadoEnum();
         } else {
             if (golesEquipo2 == golesEquipo1) {
                 //empate
                 return new ResultadoEnum();
             } else {
                 //ganador
                 return new ResultadoEnum();
             }

         }
     }
     return null;
    }

}
