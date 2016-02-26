package base;

//*Create meaningful JUnits tests.  I gave you a JUnit class under ‘src/test/java/base/MyInteger_Test.java’.  Make sure to cover each of the methods in the class (isEven(), isOdd(), etc).  Use the eclemma (http://eclemma.org/) plugin to ensure your code coverage is complete */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isEvenTest() {
		MyInteger num1 = new MyInteger(3);
		MyInteger num2 = new MyInteger(2);
		assertFalse(num1.isEven());
		assertTrue(num2.isEven());
	}

	@Test
	public void isOddTest() {
		MyInteger num1 = new MyInteger(2);
		MyInteger num2 = new MyInteger(3);
		assertFalse(num1.isOdd());
		assertTrue(num2.isOdd());
	}

	@Test
	public void isPrimeTest() {
		MyInteger num1 = new MyInteger(2);
		MyInteger num2 = new MyInteger(6);
		MyInteger num3 = new MyInteger(997);
		MyInteger num4 = new MyInteger(998);
		assertTrue(num1.isPrime());
		assertFalse(num2.isPrime());
		assertTrue(num3.isPrime());
		assertFalse(num4.isPrime());

	}

	@Test
	public void isOddIntTest() {
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(2));
	}

	@Test
	public void isOddMyIntegerTest() {
		MyInteger num1 = new MyInteger(3);
		MyInteger num2 = new MyInteger(2);
		assertTrue(MyInteger.isOdd(num1));
		assertFalse(MyInteger.isOdd(num2));
	}

	@Test
	public void isEvenIntTest() {
		assertTrue(MyInteger.isEven(2));
		assertFalse(MyInteger.isEven(3));
	}

	@Test
	public void isEvenMyIntegerTest() {
		MyInteger num = new MyInteger(2);
		MyInteger num1 = new MyInteger(3);
		assertTrue(MyInteger.isEven(num));
		assertFalse(MyInteger.isEven(num1));
	}

	@Test
	public void isPrimeIntTest() {
		assertTrue(MyInteger.isPrime(2));
		assertFalse(MyInteger.isPrime(4));
		assertTrue(MyInteger.isPrime(997));
		assertFalse(MyInteger.isPrime(998));
	}

	@Test
	public void isPrimeMyIntegerTest() {
		MyInteger num = new MyInteger(3);
		MyInteger num1 = new MyInteger(4);

		assertTrue(MyInteger.isPrime(num));
		assertFalse(MyInteger.isPrime(num1));
	}

	@Test
	public void equalsIntTest() {
		MyInteger num = new MyInteger(2);
		assertTrue(num.equals(2));
		assertFalse(num.equals(3));
	}

	@Test
	public void equalsMyIntegerTest() {
		MyInteger num1 = new MyInteger(3);
		MyInteger num2 = new MyInteger(3);
		MyInteger num3 = new MyInteger(2);
		assertTrue(num1.equals(num2));
		assertFalse(num1.equals(num3));
	}

}
