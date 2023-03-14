package eurocopa;

public class Equipos {
	public static void main(String[] args) {
	}
	    private int Id;
	    private String Nombre;
	    private String Descripcion;
	    

	    public Equipos(String nuevoNombre)
	    {
	        Nombre = nuevoNombre; //Se le da un nombre al equipo
	    }

	    //Método para obtener el Id del equipo
	    public int getId()
	    {
	        return Id;
	    }

	    //Método para establecer el Id del equipo
	    public void setId(int nuevoId)
	    {
	        Id = nuevoId;
	    }

	    //Método para obtener el nombre del equipo
	    public String getNombre()
	    {
	        return Nombre;
	    }   
	     //Metodo para obtener la descripcion del equipo
	        
	        public String getDescripcion ()
		    {
		        return Descripcion;
		        
		    }		 
	 
	    //metodo para establecer la descripcion
		    public void setdescripcion(String nuevadescripcion)
		    {
		        Descripcion = nuevadescripcion;    
	}
	    }
