package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class PersonHandler {
	
	List <Person> person = new ArrayList<>();
	
	
	public PersonHandler() {
		
	}
	public PersonHandler (List <Person> person) {
	this.person = person;

	}
	
	public void addPerson(Person person) {
	this.person.add(person);
	}
	
	public void removePerson(Person person) {
	this.person.remove(person);
		}
	// to find person method
	public Person searchName(String name) {
		for(Person p :person) {
			if(p.getName().equalsIgnoreCase(name)) {
				return p;
			} 
		}
		System.out.println( name + " This name is not found in the list." );
	return null;
	}
		
	    
	public void allperson() {
	    	for (Person p:person) {
	    		System.out.println(p);
	 
	    	}
	    }
	    
	    		
	    }
	    
	 
