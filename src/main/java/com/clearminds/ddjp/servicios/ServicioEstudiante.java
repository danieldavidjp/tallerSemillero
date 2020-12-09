package com.clearminds.ddjp.servicios;



import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.ddjp.dtos.Estudiante;
import com.clearminds.ddjp.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		
		abrirConexion();
		System.out.println("ingresando estudiante "+estudiante.toString());
		Statement stmt =null;
		
		try {
			stmt = getConexion().createStatement();
			
			String sql = "insert into estudiantes(nombre,apellido) values('"+
			estudiante.getNombre()+"','"+estudiante.getApellido()+"')";
			
			System.out.println("Script: "+sql);
			
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiate");
		}
				
	}
	

}
