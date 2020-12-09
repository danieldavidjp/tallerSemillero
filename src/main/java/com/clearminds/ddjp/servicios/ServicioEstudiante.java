package com.clearminds.ddjp.servicios;



import com.clearminds.ddjp.dtos.Estudiante;
import com.clearminds.ddjp.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		
		abrirConexion();
		System.out.println("ingresando estudiante "+estudiante.toString());
		cerrarConexion();
		
	}

}
