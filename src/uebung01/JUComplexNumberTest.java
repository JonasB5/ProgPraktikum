package uebung01;

import static org.junit.Assert.*;
import org.junit.Test;

//Test
public class JUComplexNumberTest {

	@Test
	public void testConstructorGetterSetter() {
		ComplexNumber a = new ComplexNumber(1, 3);
		assertEquals (1, a.real, 0.01);
		assertEquals (3, a.imaginary, 0.01);
	}
	
	@Test
	public void testOtherMethods() {
		ComplexNumber a = new ComplexNumber(1, 3);
		ComplexNumber b = new ComplexNumber(3, 4);
		ComplexNumber c = new ComplexNumber(2, 2);
		
		System.out.println("Test addition");
		ComplexNumber correct_result = new ComplexNumber(4, 7);
		assertEquals(correct_result, a.add(b));
		
		System.out.println("Test subtraction");
		correct_result = new ComplexNumber(-2, -1);
		assertEquals(correct_result, a.sub(b));
		
		System.out.println("Test multiplication");
		correct_result = new ComplexNumber(-9, 13);
		assertEquals(correct_result, a.mul(b));
		
		System.out.println("Test division");
		correct_result = new ComplexNumber(1, 0.5);
		assertEquals(correct_result, a.div(c));
		
		System.out.println("Test absolute");
		double correct = 5;
		assertEquals(correct, b.abs(), 0.01);
		
		System.out.println("Test conjugated");
		correct_result = new ComplexNumber(1, -3);
		assertEquals(correct_result, a.complexConj());
	}
}
