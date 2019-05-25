package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	@Test
	public void Ofizzbuzz() {
		assertEquals("fizzbuzz", FizzBuzz.fizzbuzz(15, ""));
		assertEquals("fizzbuzz", FizzBuzz.fizzbuzz(30, ""));
	}

	@Test
	public void fizz() {
		assertEquals("fizz", FizzBuzz.fizzbuzz(3, ""));
		assertEquals("fizz", FizzBuzz.fizzbuzz(6, ""));
	}

	@Test
	public void buzz() {
		assertEquals("buzz", FizzBuzz.fizzbuzz(10, ""));
	}

	@Test
	public void number() {
		assertEquals("11", FizzBuzz.fizzbuzz(11, ""));
	}
}