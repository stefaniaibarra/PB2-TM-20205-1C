package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

public class ClaseDeTest {
			// cntrol + shif + o = importa todo lo necesario 
	@Test  //dar de alta un jugador 
	public void dadoQueExisteUnJugadorAlFicharloEnLaLigaObtengoUnResultadoPositivo() {
		Equipo liga = new Equipo("boca", 1);
		Persona jugador1 = new Jugador(2, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		Persona jugador = new Jugador(1, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		liga.agregarJugador(jugador1);
		assertTrue(liga.agregarJugador(jugador));
		
	}
		
	@Test
	public void dadoQueExisteUnTecnicoAlFicharloEnLaLigaObtengoUnResultadoPositivo() {
		Equipo liga = new Equipo("boca", 1);	
		Persona tecnico = new Tecnico(3, "pp", LocalDate.of(2020, 12, 12), LocalDate.of(2021,10,15));
		Persona jugador1 = new Jugador(2, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		Persona jugador = new Jugador(1, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		liga.agregarJugador(jugador);
		liga.agregarJugador(jugador1);
		assertTrue(liga.agregarJugador(tecnico));
	}
	
	@Test
	public void dadoQueYaExistenJugadoreAlCargarUnoConMismoDniObtengoResultadoNegativo() {
		Equipo liga = new Equipo("boca", 1);
		Persona jugador1 = new Jugador(1, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		Persona jugador = new Jugador(1, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		liga.agregarJugador(jugador);
		liga.agregarJugador(jugador1);
		assertFalse(liga.agregarJugador(jugador1));
	
	}
	
	@Test
	public void obtenerListaDeJugadoresOrdenadaDeManeraDesendiente() {
		
		Equipo liga = new Equipo("boca", 1);
		Persona tecnico = new Tecnico(3, "pp", LocalDate.of(2020, 12, 12), LocalDate.of(2021,10,15));
		Persona jugador1 = new Jugador(2, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		Persona jugador = new Jugador(1, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		liga.agregarJugador(jugador);
		liga.agregarJugador(jugador1);
		liga.agregarJugador(tecnico);
		
		List<Persona> plantel =  liga.mostrarPlantel();
		
		assertEquals(tecnico, plantel.get(0));
		assertEquals(jugador1, plantel.get(1));
		assertEquals(jugador, plantel.get(2));
		
	}
	//tarea
	/*crear un equipo que tenga un plantel con cmapa clave Valor Integer  Persona
	qe se pueda Agregar Un Jugador -- 
	
	*/
	@Test
	public void dadoQueExisteUnEquipoAlAgregarloAUnaLigaObtengoUnResultadoPositivo() {
	

		Equipo equipo = new Equipo("boca", 1);
		Persona tecnico = new Tecnico(3, "pp", LocalDate.of(2020, 12, 12), LocalDate.of(2021,10,15));
		Persona jugador1 = new Jugador(2, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		Persona jugador = new Jugador(1, "aa", LocalDate.of(199, 2, 12),  Posicion.DEFENSOR);
		equipo.agregarJugador(jugador);
		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(tecnico);
		
		Liga afa = new Liga();
		
		assertTrue(afa.agregarEquipo(equipo));
		
		
	
	}
	
	/*queSePuedaAgregarUnTecnico
 	queElPlantelSePuedaAgragarSOLAMENTEUnTecnico (si el plantel ya tiene un tecnco
	lanza Una Exception  informado que ya poseeUn tecnico)
	obtenerLaEdadPromedioDeLosJugadoresDelPlantel
	
	dadoQueSeQuiereRegitrarUnTecniocoAUnplantelQueELMismoNoEsteRegistradoENLaLigaLanzaUnPersonaNoRegitradaException
	
	
	*/
	
	// dni . apellido nombre fecha de nacimiento(local date)   y eneun de posicion arquero, defensor , mediocampista delantero 
	//Tecnico dni nombre LocalDate  fechaNacimiento AnioDeHabilitacion
	
}
