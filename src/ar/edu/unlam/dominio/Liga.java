package ar.edu.unlam.dominio;

import java.util.TreeSet;

public class Liga {

	private TreeSet<Equipo> liga;
	
	
	public Liga () {
		this.liga = new TreeSet<Equipo>();
	}


	public boolean agregarEquipo(Equipo equipo) {
		
		return liga.add(equipo);
	}
	
	
	
}
