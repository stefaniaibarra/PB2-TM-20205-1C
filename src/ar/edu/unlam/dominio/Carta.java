package ar.edu.unlam.dominio;

import java.util.Objects;

public class Carta {
	private Integer salud;
	private Integer numero;  // en esta materia usamos mas las clases rapper 
	
	
	public Carta () {
		this.salud =100;
	}
	

	public int getSalud() {
	
		return this.salud;
	}

	public void recibirDanio(int danio) {
		if (danio <= this.salud ) {
			this.salud -= danio;	
		} else if (danio > this.salud){
			this.salud =0;
		}
		
		
	}


	public void setNumero(int numero) {
		this.numero = numero;
		
	}


	public Integer getNumero() {
		
		return this.numero;
	}


	@Override
	public int hashCode() {
		return Objects.hash(numero, salud);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(numero, other.numero) && Objects.equals(salud, other.salud);
	}

	
	
	
}
