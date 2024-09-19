package org.generation.classes;

import java.util.HashMap;

public class Courses {
	String courseName;
	String professorName;
	int year;
	HashMap<String, Integer> altasEstudiantes = new HashMap<String, Integer>();
	public Courses(String courseName, String professorName, int year) {
		this.courseName=courseName;
		this.professorName=professorName;
		this.year=year;
		this.altasEstudiantes = new HashMap<>();
	}
	
	 public void enroll(Student student){
	      //TODO add the student to the collection
		 String fullName = student.printFullName();
		 if(!altasEstudiantes.containsKey(fullName)) {
			 altasEstudiantes.put(fullName, student.grade);
			 System.out.println(student.printFullName() + " se inscribió a " + courseName);
		 }
	   }

	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
		   String fullName = student.printFullName();
			 if(altasEstudiantes.containsKey(fullName)) {
				 altasEstudiantes.remove(fullName);
				 System.out.println(student.printFullName() + " se dio de baja de " + courseName);
			 }
		   }

	   public int countStudents(){
	       //TODO implement
	       return altasEstudiantes.size();
	   }
	   
	   public int mejorCalificacion(){
	       //TODO implement
		   int mejorCalificacion = 0;
		   for(Integer grade:altasEstudiantes.values()) {
			   if (grade>mejorCalificacion) {
				   mejorCalificacion=grade;
			 }
		   }
	       return mejorCalificacion;
	   }

}
