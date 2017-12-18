package assignment5;

public class PhoneBookManager {
	
	//Here we declare the Person array field, namely personArray
	//personArray represents the phone-book
	//It will store the person's name, surname and phone information
	//The size of our phone-book is 100
	Person personArray[] = new Person[100];
	
	
	//this method gets a person instance
	//and adds this person to our personArray
	//the person is added to the first empty index of the array
	public void addPerson(Person person){
		int firstEmptyIndex = 0;
		for (int i = 0; i < personArray.length; i++) {
			if (personArray[i] == null){
				firstEmptyIndex = i;
				break;
			}
		}
		personArray[firstEmptyIndex] = person;
		System.out.println("Person is successfully added");
		System.out.println("++++++++++++++++++++++++++++");	
	}

	//This methods searches for the person whose name
	// and surname information are provided through parameters
	public long searchPerson(String name, String surname) {
		for (int i = 0; i < personArray.length; i++) {
			if (personArray[i] != null){
				if ((name.equals(personArray[i].getName())) 
						&& (surname.equals(personArray[i].getSurname()))){
						return personArray[i].getPhone();
				}
			}
		}
		return 0;
	}

	//This methods prints name, surname and phone information of
	//all person in the phonebook
	public void printPersonList(){
		System.out.println("Person List");
		for (int i = 0; i < personArray.length; i++) {
			if (personArray[i] != null){
				System.out.print("Name, Surname and Phone: " + personArray[i].getName() + "\t");
				System.out.println(personArray[i].getSurname() + "\t" + personArray[i].getPhone());
			}
		}
	}


}
