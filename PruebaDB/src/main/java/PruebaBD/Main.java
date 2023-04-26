package PruebaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
	
	public static void main(String[] args) {

			String servidor = "www.educando.net.ar:3306"; String baseDatos = "vpvejznx_ariatech";			String usuario = "vpvejznx_argentina-programa";
			String clave = "Estoesunabddeprueba!";
			String url = "jdbc:mysql://" + servidor + "/" +baseDatos+
					"?serverTimezone=America/Argentina/Buenos_Aires";
			
			java.sql.Connection cnx=null;
			try
			{
				cnx = java.sql.DriverManager.getConnection(url, usuario, clave);
				java.sql.Statement stmt = cnx.createStatement();
				// Se prepara el string SQL de la consulta
				String sql = "SELECT apellido, nombre  FROM Participantes";
				// Se ejecuta la sentencia y se recibe un resultado
				java.sql.ResultSet rs = stmt.executeQuery(sql);
				while (rs.next())
				{
				String apellido = rs.getString("apellido");
				String nombre = rs.getString("nombre");
				System.out.println("nombre: " + nombre +" "+apellido);
				}
				
				rs.close();
				stmt.close();
			}
			catch (java.sql.SQLException ex)
			{
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
			}
			
	}
}