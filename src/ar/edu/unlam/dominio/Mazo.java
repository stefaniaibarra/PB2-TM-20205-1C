package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Mazo {
	
	
	private ArrayList <Carta> cartas;
	private static final int MAXIMO_CARTAS = 5;
	private static final int MAXIMO_DUPLICADA = 2;
	
	//costructor
	public Mazo () {
		this.cartas = new ArrayList<Carta>();
		
	}
	
	//metodos
	public boolean agragarCarta(Carta carta) {
		boolean agregado = false;
		int contador = 0; 
		
		
			if (cartas.contains(carta)) {
				for (Carta cartaDeColeccion  : cartas) { // itera todos los elemtos 
					// tipo de elemento , cartaDeColeccion es una variable auxiliar 
					//que tomara la carta en la posicion del la lista que se esta iterando 
					// cartas, el la lista q se busca iterar 
					if (cartaDeColeccion.getNumero().equals(carta.getNumero())) {
						contador++;
					}
				
				}
			
			}
		
			if (this.cartas.size() < MAXIMO_CARTAS && contador < MAXIMO_DUPLICADA ){
				agregado = this.cartas.add(carta);
			}
		return agregado;
	}

}
