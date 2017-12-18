package assignment5;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;

public class test {
	//This method will test the addPerson method inputing just the name and surname
	@Test
	public void testAddPerson1() {
		//Create the PhoneBookManager object and add a person
		PhoneBookManager phonebook = new PhoneBookManager();
		Person persoana = new Person("George", "Smith");
		phonebook.addPerson(persoana);
		String expected = persoana.getName(); //Create the expected variable
		//Create the actual assertion
		assertEquals(expected, "George");
	}
	//This method will test the addPerson method inputing the name, surname and phone number
	//It will use the surname like expected value
	@Test
	public void testAddPerson2() {
		//Create the PhoneBookManager object and add a person
		PhoneBookManager phonebook = new PhoneBookManager();
		Person persoana = new Person("John", "Rob", 434567890);
		phonebook.addPerson(persoana);
		String expected = persoana.getSurname();  //Create the expected variable
		//Create the actual assertion
		assertEquals(expected, "Rob");
	}
	//This method will test the addPerson method inputing the name, surname and phone number
	//It will use the phone number like expected value
	@Test
	public void testAddPerson3() {
		//Create the PhoneBookManager object and add a person
		PhoneBookManager phonebook = new PhoneBookManager();
		Person persoana = new Person("John", "Rob", 434567890);
		phonebook.addPerson(persoana);
		long expected = persoana.getPhone(); //Create the expected variable
		//Create the actual assertion
		assertEquals(expected, 434567890);
	}
	//This method will test the searchPerson method
	@Test
	public void testSearchPerson () {
		//Create the PhoneBookManager object and add a person
		PhoneBookManager phonebook = new PhoneBookManager();
		Person persoana = new Person("John", "Rob", 434567890);
		phonebook.addPerson(persoana);
		long expected = phonebook.searchPerson("John", "Rob"); //Create the expected 
		//Create the actual assertion
		assertEquals(expected, 434567890);
	}
	//This method will test the printPersonList method
	@Test
	public void printTest() throws Exception {
		  //After this code all System.out.println() statements will come to outContent stream
	      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	      System.setOut(new PrintStream(outContent));
	      //Create the PhoneBookManager object and add a person
	      PhoneBookManager phonebook = new PhoneBookManager();
	      Person persoana = new Person("John", "Rob", 434567890);
		  phonebook.addPerson(persoana);	
		  phonebook.printPersonList();   //Call the print method
		  //Create the expected string
		  String expected  = "Person is successfully added\n" + 
	     		"++++++++++++++++++++++++++++\n" + 
	     		"Person List\n" + 
	     		"Name, Surname and Phone: John	Rob	434567890\n"; 
		  //The actual assertion
		  assertEquals(expected, outContent.toString());
	}
	
	@After
	public void tearDown() {
		System.out.println("Test is ended...");
	}
}
