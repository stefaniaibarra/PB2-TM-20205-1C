package ar.edu.unlam.dominio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MazoTest {
	private Mazo mazo; // mazo se deja como atributo de la clase, ya que esta
	//implic ado en mas de un test 
	
			// mazo con 5 cartas (maximo)
			// se admite duplicadas ( hasta 2 iguales ) 
			// 
	@Before
	public void init() { // generara lo que tenga dentro antes de hacer testing 
		this.mazo = new Mazo();
	}
	
	@Test 
	public void dadoQueExistenCartasCuandoAgregoUnaCartaAlMazoObtengoUnResultadiPositivo () {
		//preparacion 
		Carta carta = new Carta();
		
		//ejecucion
		boolean cartaAgregada = this.mazo.agragarCarta(carta);
		
		//verificacion 
		assertTrue(cartaAgregada);
	}
	
	@Test 
	public void dadoQueExistenCartasCuandoAgregoUnaCartaMasAlMAximoPermitidoObtengoUnResultadoNegativo () {
		//preparacion 

		Carta carta = new Carta();
		carta.setNumero(1);
		
		Carta carta2 = new Carta();
		carta2.setNumero(2);
		
		Carta carta3 = new Carta();
		carta3.setNumero(3);

		
		
		//ejecucion
		
			boolean cartaAgregada1 = this.mazo.agragarCarta(carta);
			boolean cartaAgregada2 = this.mazo.agragarCarta(carta);
			boolean cartaAgregada3 = this.mazo.agragarCarta(carta2);
			boolean cartaAgregada4 = this.mazo.agragarCarta(carta2);
			boolean cartaAgregada5 = this.mazo.agragarCarta(carta3);
			boolean cartaAgregada6 = this.mazo.agragarCarta(carta3);
	
		//verificacion 
		assertTrue(cartaAgregada1);
		assertTrue(cartaAgregada2);
		assertTrue(cartaAgregada3);
		assertTrue(cartaAgregada4);
		assertTrue(cartaAgregada5);
		assertFalse(cartaAgregada6);
	}
	
	// duplicado 
	@Test
	public void DadoQueExistenCartasCuandoAgregoUnaCartaMasIgualAlMAximoPermitidoDeRepetidasObtengoUnResultadoNegativo () {
		//preparacion 
		Carta carta = new Carta();
		// en clase carta ponemos un id
		carta.setNumero(1);
		
		
		//ejecucion
		
			boolean cartaAgregada1 = this.mazo.agragarCarta(carta);
			boolean cartaAgregada2 = this.mazo.agragarCarta(carta);
			boolean cartaAgregada3 = this.mazo.agragarCarta(carta);
			
		//verificacion 
		assertTrue(cartaAgregada1);
		assertTrue(cartaAgregada2);
		assertFalse(cartaAgregada3);
	}
	
	
	

}
