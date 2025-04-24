package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartaTest {
  
	
	public void miTest() {
		
		// preparacion : informacion que necesita para ser ejecutado 
				//dadoQueExisteUnaCartaCon100Salud
		
		// ejecucion  : hacer uso de uno o mas matodos dentro de otra clase 
				//AlRicibir20Danio
		
		// verificacion : verificar que el escenario sea el requerido 
				// DebeQuedar80Salud
		
		//****** despues de terminar todos los test 
		
		// revision de codigo --> refectorizar 
		
	}
	
	/*liniamientos generales 
	--> escribir un metodo, ejecutarlo y tiene q fallar 
	--> agregar la manor cantidad de codigo necesario para q la prueba pase 
	-->
	*/
	@Test
	
	public void dadoQueNoExisteUnaCartaAlCrearceLaSaludEs100() {
		//preparacion
		Carta carta = new Carta();
		
		 int valorEsperado = 100;
		 int valorObtenido = carta.getSalud();
		 
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	 public void dadoQueExisteUnaCartaCon100SaludAlRicibir20DanioDebeQuedar80Salud() {
		// preparacion 
		 Carta carta = new Carta() ; 
		 // ejecucion 
		 carta.recibirDanio(20);
		 
		 //verificacion 
		 int valorEsperado = 80;
		 int valorObtenido = carta.getSalud();
		 
		 assertEquals(valorEsperado, valorObtenido);
		 
	 }
	 @Test
	 public void dadoQueExisteUnaCartaCon100SaludAlRicibir120DanioDebeQuedar0Salud() {
			// preparacion 
			 Carta carta = new Carta() ; 
			 // ejecucion 
			 carta.recibirDanio(120);
			 
			 //verificacion 
			 int valorEsperado = 0;
			 int valorObtenido = carta.getSalud();
			 
			 assertEquals(valorEsperado, valorObtenido);
			 
	 
	 }
	 
	
}
