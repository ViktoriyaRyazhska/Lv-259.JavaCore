import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.com.Breed;
import edu.com.Dog;

public class DogTest {

	Dog dog = new Dog();
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Running tests.\n");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("\nFinishing tests.");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Starting test.");
		dog.setName("Jack");
		dog.setAge(14);
		dog.setBreed(Breed.Boxer);

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Ending test.\n");
	}

	@Test
	public void testGetName() {
		System.out.println("Testing getName()");
		String actual = "Jack";
		String expected = dog.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAge() {
		System.out.println("Testing getAge()");
		int actual = 14;
		assertTrue(actual == dog.getAge());
	}

	@Test
	public void testGetBreed() {
		System.out.println("Testing getBreed()");
		Breed actual = Breed.Boxer;
		assertEquals(dog.getBreed(), actual);
	}

	@Test
	public void testEqualsObject() {
		System.out.println("Testing overrided equals()");
		Dog actual = new Dog("Jack", 14, Breed.Boxer);
		assertTrue(actual.equals(dog));
	}

	@Test
	public void testSetName() {
		System.out.println("Testing setName()");
		String actual = "Mark";
		dog.setName(actual);
		assertEquals(dog.getName(), actual);
	}

	@Test
	public void testSetAge() {
		System.out.println("Testing setAge()");
		int actual = 14;
		dog.setAge(actual);
		assertTrue(actual == dog.getAge());
	}

	@Test
	public void testSetBreed() {
		System.out.println("Testing setBreed()");
		Breed actual = Breed.Boxer;
		dog.setBreed(actual);
		assertEquals(dog.getBreed(), actual);
	}

	@Test
	public void testToString() {
		System.out.println("Testing overrided toSring()");
		String actual = "name=" + dog.getName() + ", age=" + dog.getAge() + ", breed=" + dog.getBreed();
		assertEquals(dog.toString(), actual);
	}

	@Test
	public void testSelectBreed() {
		System.out.println("Testing selectBreed()");
		Breed actual = Breed.Boxer;
		dog.selectBreed("boxer");
		assertEquals(dog.getBreed(), actual);

	}

	@Test
	public void testCheckEquality() {
		Dog actual = new Dog("Jack", 10, Breed.Beagle);
		String str = dog.getBreed() + " " + dog.getName() + " has the same name as " + actual.getBreed() + " "
				+ actual.getName();
		assertEquals(str, dog.checkEquality(actual));
	}

}
