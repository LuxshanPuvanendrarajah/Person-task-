package com.qa.person;


public class runner {
	public static void main(String[] args) {
		
		PersonHandler person = new PersonHandler();
		
		
		Person personOne = new Person("Ronaldo",36,"Footballer");
		Person personTwo = new Person("Doris",52,"Gardener");
		Person personThree = new Person("Josh",20,"Student");
	
		person.addPerson(personOne);
		person.addPerson(personTwo);
		person.addPerson(personThree);
		
		
		
	
		
    System.out.println(person.searchName("ronaldo"));
    
		
	person.allperson();
	
    }
}
