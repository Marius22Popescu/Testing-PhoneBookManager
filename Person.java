package assignment5;


public class Person {
      
	  private String name;
	  private String surname;
	  private long phone;
	 	
	  public Person(){};
	  public Person(String personName,String personSurname)
	  { 
	    	name=personName;
	    	surname=personSurname;
	  }
	  public Person(String personName,String personSurname,long personPhone)
	  { 
	    	name=personName;
	    	surname=personSurname;
	    	phone=personPhone;
	    	 
	  }
	    
	  public String getName() {
	        return name;
	  }
	  public void setName(String personName) {
		    name = personName;
	  }
	  public String getSurname() {
		    return surname;
	  }
	  public void setSurname(String personSurname) {
	        surname = personSurname;
	  }
	  public long getPhone() {
	        return phone;
	  }
	  public void setPhone(long personPhone) {
	        phone = personPhone;
	   }    
 }
	    

