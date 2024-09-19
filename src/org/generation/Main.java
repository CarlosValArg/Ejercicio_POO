package org.generation;
import org.generation.classes.Student;
import org.generation.classes.Courses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student carlos = new Student("Carlos", "Valencia", 2772, 10, 2022);
		Student sergio = new Student("Sergio", "Villanueva", 2773, 9, 2022);
		Student ivan = new Student("Ivan", "Ballesteros", 2774, 5, 2022);
		Student mario = new Student("Mario", "Pérez", 2775, 6, 2022);
		Student julieta = new Student("Julieta", "Argueta", 2776, 10, 2022);
		Student javier = new Student("Javier", "Aguirre", 2777, 7, 2022);
		Student mauricio = new Student("Mauricio", "Coronado", 2778, 7, 2022);
		Courses course = new Courses("Geografía", "David Serratos", 2022);
		course.enroll(carlos);
		course.unEnroll(carlos);
		course.enroll(sergio);
		course.unEnroll(sergio);
		course.enroll(ivan);
		course.unEnroll(ivan);
		course.enroll(mario);
		course.unEnroll(mario);
		course.enroll(julieta);
		course.unEnroll(julieta);
		course.enroll(javier);
		course.unEnroll(javier);
		course.enroll(mauricio);
		course.unEnroll(mauricio);
		carlos.changeYearIfApproved();
		mauricio.changeYearIfApproved();
		
		
		

	}

}
