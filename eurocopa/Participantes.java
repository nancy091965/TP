package eurocopa;

public class Participantes {
	
	
	private String nombre;
	private String apellido;
	private String direccionMail;
	
	public Participantes(String nombre, String apellido, String direccionMail ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccionMail = direccionMail;
	
	}
 
	public String getNombre() {
		return nombre;
	}
 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public String getApellido() {
		return apellido;
	}
 
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
 
	public String getDireccionMail() {
		return direccionMail;
	}
 
	public void setDireccion(String direccion) {
		this.direccionMail = direccionMail;
	}
 
	
	}
 
	
 
	


