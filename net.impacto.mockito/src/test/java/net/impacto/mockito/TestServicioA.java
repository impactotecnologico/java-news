package net.impacto.mockito;

import org.junit.Test;

import junit.framework.Assert;
import net.impacto.mockito.ServicioA;
import net.impacto.mockito.ServicioAImpl;

public class TestServicioA {
	@Test
	public void testSuma() {

		int a = 2;
		int b = 2;
		ServicioA servicio = new ServicioAImpl();
		Assert.assertEquals(servicio.sumar(a, b), 4);

	}
}