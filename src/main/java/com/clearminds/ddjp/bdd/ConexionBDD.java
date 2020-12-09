package com.clearminds.ddjp.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.ddjp.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		String propiedadFinal;
		;
		try {
			p.load(new FileReader("conexion.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Archivo no encontrado");
		}

		if (p.getProperty(propiedad) != null) {

			propiedadFinal = p.getProperty(propiedad);

		} else {

			propiedadFinal = null;
		}

		return propiedadFinal;

	}

	public static Connection obtenerConexion() throws BDDException {

		String url = leerPropiedad("urlConexion");
		String user = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BDDException("Error al conectar con la base de datos");
		}

		return conn;
	}

}
