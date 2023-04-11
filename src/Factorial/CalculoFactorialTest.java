package Factorial;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculoFactorialTest {

	@ParameterizedTest
    @CsvSource({"0,1", 
    			"1,1", 
    			"5,120", 
    			"15,2004310016"})
    void testFactorialRecursivo(int numero, int resultadoEsperado) 
	{
        CalculoFactorial objFactorial = new CalculoFactorial();
        assertEquals(resultadoEsperado, objFactorial.Factorial(numero));
    }

}
