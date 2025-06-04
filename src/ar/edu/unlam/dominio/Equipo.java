package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Equipo {
	private String nombre;
	private Integer codigo;
	private TreeSet<Persona> plantel;
	
	
	
	
	public Equipo (String nombre,Integer cod) {
		this.nombre = nombre;
		this.codigo = cod;
		this.plantel = new TreeSet<Persona>();
	}

	public boolean agregarJugador(Persona jugador) {
	
		return 	plantel.add(jugador);
	}

	public List<Persona> mostrarPlantel() {
		ArrayList<Persona> plantelCompleto = new ArrayList<Persona>();
		
		for (Persona persona : this.plantel) {
			plantelCompleto.add(persona);
			
		}
	
		return plantelCompleto;
		
	}

	
	
	
	
	
}
