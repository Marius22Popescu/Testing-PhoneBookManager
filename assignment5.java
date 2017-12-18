package assignment5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class assignment5 {
	public static void main(String args[]) {
		PhoneBookManager phonebook = new PhoneBookManager();
	    Person persoana = new Person("John", "Rob", 434567890);
	    phonebook.addPerson(persoana);
		phonebook.printPersonList();		
	}
	}
