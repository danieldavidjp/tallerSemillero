package com.clearminds.ddjp.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {


	public static String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		String propiedadFinal = p.getProperty(propiedad);
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

		if (propiedadFinal != null) {

			System.out.println(propiedadFinal);

		} else {
			
			propiedadFinal = null;
		}

		return propiedadFinal;

	}

}
