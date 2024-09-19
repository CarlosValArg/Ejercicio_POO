package org.generation.classes;

public class Student {
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       public Student (String firstName, String lastName, int registration, int grade, int year) {
		    	this.firstName=firstName;
		    	this.lastName=lastName;
		    	this.registration=registration;
		    	this.grade=grade;
		    	this.year=year;
		    }
		    public Student (String firstName, String lastName, int registration) {
		    	this (firstName, lastName, registration, 7, 2022);
		    }
		    public Student (String firstName, String lastName) {
		    	this (firstName, lastName, 2772, 10, 2022);
		    }
	       
	    public String printFullName(){
	    	return (firstName + " " + lastName);
	    	   //TODO implement
	    	   }

	    public boolean isApproved(){
	    	if(grade>=60) {
	    System.out.println("Aprobado");
	    	return true;
	    	//TODO implement: should return true if grade >= 60
	    	   }
	    	else {
	    		System.out.println("Reprobado/a");
	    		return false;
	    	}
	    }


	    		 

	    public int changeYearIfApproved(){
	    	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
	    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
	    	if(isApproved()) {
	    		year +=1;
	    		System.out.println("Felcidades has Aprovado");
	    	}else {
	    		System.out.println("Se debe repetir el año");
	    	}
	    	return year;
	    	   }
	    
}
