package com.qa.person;


public class Person {
// name, age and job title variables.
private String name;
private int age;
private String occupation;
//
public Person() {
	
}
public Person(String name, int age, String occupation) {
	super();
	this.name = name;
	this.age = age;
	this.occupation = occupation;
}



//getters and setters

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}

@Override
public String toString() {
	return "Person name : " + name + "\n Age : " + age + " occupation : " + occupation;

}

}
