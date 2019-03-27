package it.example.mockito;

import org.junit.Test;

import junit.framework.Assert;

public class TestServicioA {
	@Test
	public void testSuma() {

		int a = 2;
		int b = 2;
		ServicioA servicio = new ServicioAImpl();
		Assert.assertEquals(servicio.sumar(a, b), 4);

	}
}