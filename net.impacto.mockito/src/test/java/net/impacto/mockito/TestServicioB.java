package net.impacto.mockito;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

import net.impacto.mockito.ServicioA;
import net.impacto.mockito.ServicioB;
import net.impacto.mockito.ServicioBImpl;

public class TestServicioB {

	@Test
	public void testMultiplicacion() {
		ServicioB servicioB = new ServicioBImpl();
		Assert.assertEquals(6, servicioB.multiplicar(2, 3));
	}

	@Test
	public void testmultiplicarSumar() {

//		ServicioA servicioA = new ServicioAImpl();
//		ServicioB servicioB = new ServicioBImpl();
//		servicioB.setServicioA(servicioA);
//		Assert.assertEquals(10, servicioB.multiplicarSumar(2, 3, 2) );

		  ServicioA servicioA = mock(ServicioA.class); 
		  when(servicioA.sumar(6,7)).thenReturn(5);
		  
		  ServicioB servicioB = new ServicioBImpl(); 
		  servicioB.setServicioA(servicioA);
		  Assert.assertEquals(servicioB.multiplicarSumar(6, 7, 2), 10);
		 

	}

}