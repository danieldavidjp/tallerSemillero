package com.clearminds.ddjp.bdd.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.ddjp.bdd.ConexionBDD;
import com.clearminds.ddjp.excepciones.BDDException;

public class TestConexion {
	
	public static void main(String[] args) {
		try {
			
			Connection conexion= ConexionBDD.obtenerConexion();
			if(conexion != null){
				
				System.out.println("Conexion Exitosa");
			}
			
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println("No se puede conectar a la base de datos");
		}

}
}