package TPracticoGrupoUnomaven;

public class Participantes {

	private String nombre;
	private String apellido;
	private String idParticipante;
	private int puntos;
	
	
	
	public Participantes(String idParticipante, String nombre, String apellido ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.idParticipante=idParticipante;}
	
 
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
 
	public String getidParticipante() {
		return idParticipante;
	}
 
	public void setIdParticipante(String idParticipante) {
		this.idParticipante=idParticipante;
	}

	public void setIdPuntos(int puntos) {
		this.puntos=puntos;
	}

	public int getIdPuntos() {
		return puntos;
	}
	
	} 
	
	
