package eurocopa;
class Partido{}
//reemplazar clase partido por la clase cuando esté creada.
public class Ronda {
        public static void main(String[] args) {
        }
        private String nroronda;
        private Partido[] partidos;

        public void ronda(String nrindividual, Partido[] partidoindividual){
         //crea cada instancia individual
            nroronda = nrindividual;
            partidos = partidoindividual;
        }
         public String getNroronda() {
            return nroronda;
        //se lee nr de ronda
        }
        public Partido[] getpartido(){
             return partidos;
        //se lee nr de partido
        }
        public int puntos(){
            int suma = 0;
            //recorrer partidos
            return suma;
        }


}

// no puedo hacer la clase pronóstico hasta no tener creadas las clases asociadas