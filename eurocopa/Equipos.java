package eurocopa;

public class Equipos {
	
	
	    private int Id;
		// el ejercicio no pide este ID. No será mejor sacarlo?
	    private String Nombre;
	    private String Descripcion;
	    
        //Genero un metodo constructor
	    public Equipos ( String nuevoNombreX, String descripcionx, int Id) {
		
	   
	    	 this.Nombre= nuevoNombreX;
	    	 this.Descripcion= descripcionx;
	    	 this.Id= Id;
	  }
 //METODO PARA OBTENER EL ID DEL EQUIPO
		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}
		
  //METODO PARA OBTENER EL NOMBRE DEL EQUIPO
		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		
   //METODO PARA OBTENER LA DESCRIPCION DEL EQUIPO
		public String getDescripcion() {
			return Descripcion;
		}

		public void setDescripcion(String descripcion) {
			Descripcion = descripcion;
		}
		
		
	     
	}
	