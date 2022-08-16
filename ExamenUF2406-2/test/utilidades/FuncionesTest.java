package utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionesTest {

private static Funciones f;
	
	@BeforeAll
	static void inicializarFunciones() {
		f=new Funciones();
	}
	
	
	@Test
	void devuelveCentralTest() {
		assertEquals(4,f.devuelveCentral(4,1,5),"Debe devolver 4");
		assertEquals(4,f.devuelveCentral(4,5,1),"Debe devolver 4");
		assertEquals(4,f.devuelveCentral(1,4,5),"Debe devolver 4");
		assertEquals(4,f.devuelveCentral(5,4,1),"Debe devolver 4");
		assertEquals(4,f.devuelveCentral(5,1,4),"Debe devolver 4");
	}
	
	@Test
	void esBisiestoTest() {
		assertAll(
				()->assertThrows(ArithmeticException.class,()-> f.esBisiesto(1669),"Debe ser superior a 1700"),
				()->assertThrows(ArithmeticException.class,()-> f.esBisiesto(2501),"Debe ser inferior a 2500"),
				()->assertFalse(f.esBisiesto(1983),"Debe devolver false"),
				()->assertFalse(f.esBisiesto(2500),"Debe devolver false"),
				()->assertTrue(f.esBisiesto(2016),"Debe devolver true"),
				()->assertTrue(f.esBisiesto(2028),"Debe devolver true")
		);
	}

}
