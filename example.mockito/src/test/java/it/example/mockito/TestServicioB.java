package it.example.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

public class TestServicioB {

	@Test
	public void testMultiplicacion() {

		ServicioB servicioB = new ServicioBImpl();
		Assert.assertEquals(servicioB.multiplicar(2, 3), 6);

	}

	@Test
	public void testmultiplicarSumar() {

		ServicioA servicioA = mock(ServicioA.class);
		when(servicioA.sumar(2, 3)).thenReturn(5);

		ServicioB servicioB = new ServicioBImpl();
		servicioB.setServicioA(servicioA);
		Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2), 10);

	}

}