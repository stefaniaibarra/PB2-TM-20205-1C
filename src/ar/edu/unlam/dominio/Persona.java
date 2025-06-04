package ar.edu.unlam.dominio;

import java.time.LocalDate;

	public class Persona implements Comparable<Persona> {
	protected Integer dni;
	protected String apellido;
	protected LocalDate fechaDeNAcimiento;
	
	
	
	
	public Persona(int dni, String apellido, LocalDate fechaDeNAcimiento) {
		this.dni = dni;
		this.apellido = apellido;
		this.fechaDeNAcimiento = fechaDeNAcimiento;
	}


	public int getDni() {
	 return this.dni;
 }


	@Override
	public int compareTo(Persona perso) {
		
	//	return this.dni.compareTo(perso.dni); <-- ordena de manera asendente
		return perso.dni.compareTo(this.dni); // <-- al invertir el orden de comparacion se invien¿rte el orden de ordenamiento 
	}

	

}
