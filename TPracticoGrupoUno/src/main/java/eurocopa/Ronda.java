package torneoEurocopa;

//reemplazar clase partido por la clase cuando esté creada.
public class Ronda {
        public static void main(String[] args) {
        }
        private String nroronda;
        private Partidos[] partidos;

        public void ronda(String nrindividual, Partidos[] partidoindividual){
         //crea cada instancia individual
            nroronda = nrindividual;
            partidos = partidoindividual;
        }
         public String getNroronda() {
            return nroronda;
        //se lee nr de ronda
        }
        public Partidos[] getpartido(){
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