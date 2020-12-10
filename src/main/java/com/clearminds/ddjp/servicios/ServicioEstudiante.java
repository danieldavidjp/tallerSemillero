package com.clearminds.ddjp.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.clearminds.ddjp.dtos.Estudiante;
import com.clearminds.ddjp.excepciones.BDDException;
import com.clearminds.ddjp.utils.DateUtil;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {

		abrirConexion();
		System.out.println("ingresando estudiante " + estudiante.toString());
		Statement stmt = null;
		
		try {
			stmt = getConexion().createStatement();

			
			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion) values('" + estudiante.getNombre() + "','"
					+ estudiante.getApellido() + "',"+estudiante.getEdad() +",'"+ DateUtil.obtenerFecha(new Date()) +"')";

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiate");
		}

	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {

		abrirConexion();
		System.out.println("ingresando estudiante " + estudiante.toString());
		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();

			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "', apellido='"
					+ estudiante.getApellido() + "',edad="+estudiante.getEdad()+ ",fecha_modificacion='"+ DateUtil.obtenerFecha(new Date())+ "' where id ="+estudiante.getId();

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiate");
		}

	}

}
