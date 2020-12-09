package com.clearminds.ddjp.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.ddjp.bdd.ConexionBDD;
import com.clearminds.ddjp.excepciones.BDDException;

public class ServicioBase {

	Connection conexion;

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public void abrirConexion() throws BDDException {

		conexion = ConexionBDD.obtenerConexion();
	}

	public void cerrarConexion() {

		try {

			if (conexion != null) {
				conexion.close();
				System.out.println("Conexion Cerrada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al cerrar la conexion");
		}

	}
}
