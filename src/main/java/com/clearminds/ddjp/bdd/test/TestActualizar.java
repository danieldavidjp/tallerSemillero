package com.clearminds.ddjp.bdd.test;

import com.clearminds.ddjp.dtos.Estudiante;
import com.clearminds.ddjp.excepciones.BDDException;
import com.clearminds.ddjp.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();

		try {
			srvEstudiante.actualizarEstudiante(new Estudiante(2,"Pedro", "Navaja"));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}

	}

}
