package org.mvpigs.Cotxox;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mvpigs.Cotxox.carrera.Carrera;

import junit.framework.Assert;

public class Introducir_punto_recogida {

	String tarjetaCredito = "4916119711304546";
	String origen = "Aeroport Son Sant Joan";
	String destino = "Magaluf";
	double distancia = 7.75;
	int tiempoEsperadoMinutos = 10;
	Carrera carrera;
	/*
	 * Indicamos que al principio inicialice nuestra clase
	 */
	@Before
	public void testConstructor() {
		carrera=new Carrera(tarjetaCredito);
	}
	
	
	@Test
	public void testOrigen() {
		
		carrera.setOrigen(origen);
		assertEquals(origen,carrera.getOrigen());
		carrera.setOrigen("Patata");
		assertEquals("Patata",carrera.getOrigen());
	
	}
	@Test
	public void testTarjeta() {
		String [] Tarjetascredito= {"4916119722304546", "4916129711304546", "4916145711304546", "7696119711304546"};
		for (String Tarjetavisa:Tarjetascredito) {
			carrera = new Carrera(Tarjetavisa);
			assertEquals(Tarjetavisa, carrera.getTarjetaCredito());
		}
	
	}
	

}

