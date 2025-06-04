package ar.edu.unlam.dominio;

import java.time.LocalDate;

public class Jugador extends Persona {
	private Posicion posicion;
	

	public Jugador( int dni, String apellido, LocalDate fechaDeNAcimiento, Posicion posicion) {
		super(dni, apellido, fechaDeNAcimiento);
		this.posicion = posicion;
	}
	
	
	
	
	

}
