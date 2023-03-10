package service;

import model.Course;
import model.CourseGradeType;
import model.Degree;
import model.Faculty;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		
		Student st2 = new Student("Jānis", "Bērziņš", Faculty.ITF, "121200-12345");
		System.out.println(st2);
		Student st3 = new Student("Līga", "Jaukā", Faculty.ITF, "121400-12345");
		System.out.println(st3);
		
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Karina", "Šķirmante", Degree.master);
		System.out.println(pr2);
		Professor pr3 = new Professor("Gaļina", "Hiļķeviča", Degree.phd);
		System.out.println(pr3);
		
		Course c1 = new Course();
		System.out.println(c1);
		
		Course c2 = new Course("Programmēšana tīmeklī JAVA", 4, CourseGradeType.EXAM, pr2);
		System.out.println(c2);
		
		Course c3 = new Course("Diferencialvienādojumi", 2, CourseGradeType.EXAM, pr3);
		System.out.println(c3);
		
		Course c4 = new Course("Datu Struktūras un pamatalgoritmi", 2, CourseGradeType.EXAM, pr2);
		System.out.println(c4);
		
		Grade gr1 = new Grade();
		System.out.println(gr1);
		
		Grade gr2 = new Grade(10, st2, c2);
		System.out.println(gr2);
		Grade gr3 = new Grade(6, st3, c2);
		System.out.println(gr3);
		Grade gr4  = new Grade(5, st2, c3);
		System.out.println(gr4);
		
		
		
		
	}

}
