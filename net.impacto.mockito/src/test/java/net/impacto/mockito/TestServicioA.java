package net.impacto.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.impacto.mockito.ServicioA;
import net.impacto.mockito.ServicioAImpl;

public class TestServicioA {
	@Test
	public void testSuma() {

		int a = 2;
		int b = 2;
		ServicioA servicio = new ServicioAImpl();
		assertEquals(servicio.sumar(a, b), 4);

	}
}