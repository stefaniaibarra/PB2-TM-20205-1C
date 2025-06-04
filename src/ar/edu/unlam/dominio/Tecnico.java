package ar.edu.unlam.dominio;

import java.time.LocalDate;

public class Tecnico  extends Persona {
	private LocalDate anioDeHabilitacion;

	public Tecnico(int dni, String apellido, LocalDate fechaDeNAcimiento, LocalDate anioDeHabilitacion) {
		super(dni, apellido, fechaDeNAcimiento);
		this.anioDeHabilitacion = anioDeHabilitacion;
		
	}

}
