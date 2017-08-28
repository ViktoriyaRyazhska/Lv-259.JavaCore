import static org.junit.Assert.*;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import task2.Dog;
import task2.Dog.Breed;

public class Test1 {

	Dog dog = new Dog();
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("\tBefore Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("\tAfter Class");
	}

	@Before
	public void setInfo() {
		System.out.println("\tStart test");
		dog.setName("Alfa");
		dog.setAge(10);
		dog.setBreed(Breed.AKITA_INU);
	}

	@After
	public void tearDown() {
		System.out.println("\tEnd of the test");
	}

	@Test
	public void testGetName() {
		System.out.println("Test getName()");
		String actual = "Alfa";
		String expected = dog.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAge() {
		System.out.println("Test getAge()");
		int actual = 10;
		assertTrue(actual == dog.getAge());
	}

	@Test
	public void testGetBreed() {
		System.out.println("Test getBreed()");
		Breed actual = Breed.AKITA_INU;
		assertEquals(dog.getBreed(), actual);
	}

	@Test
	public void testSetName() {
		System.out.println("Test setName()");
		String actual = "Rex";
		dog.setName(actual);
		assertEquals(dog.getName(), actual);
	}

	@Test
	public void testSetAge() {
		System.out.println("Test setAge()");
		int actual = 2;
		dog.setAge(actual);
		assertTrue(actual == dog.getAge());
	}

	@Test
	public void testSetBreed() {
		System.out.println("Test setBreed()");
		Breed actual = Breed.BRAZILIAN_DOGO;
		dog.setBreed(actual);
		assertEquals(dog.getBreed(), actual);
	}

	@Test
	public void testIsEquals() {
		System.out.println("Test isEquals()");
		Dog actual = new Dog("Alfa", 10, Breed.AKITA_INU);
		assertTrue(actual.equals(dog));
	}
	
	@Test
	public void testToString() {
		System.out.println("Test toSring()");
		String actual = "Dog [name=" + dog.getName() + ", age=" + dog.getAge() + ", breed=" + dog.getBreed() + "]";
		assertEquals(dog.toString(), actual);
	}

}
