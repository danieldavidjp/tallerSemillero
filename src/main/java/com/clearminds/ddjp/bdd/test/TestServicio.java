package com.clearminds.ddjp.bdd.test;

import com.clearminds.ddjp.dtos.Estudiante;
import com.clearminds.ddjp.excepciones.BDDException;
import com.clearminds.ddjp.servicios.ServicioEstudiante;

public class TestServicio {
	
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Marco","Chavez"));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}

}
