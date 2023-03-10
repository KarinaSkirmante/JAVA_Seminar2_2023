package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.CourseGradeType;
import model.Degree;
import model.Faculty;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		int[] mas = new int[5];
		
		Professor[] allProfessors = new Professor[6];
		Course[] allCourses = new Course[6];
		Grade[] allGrades = new Grade[6];
		
		
		
		//TODO create 4 arrays and add all elements
		//TODO using loop print out all elements 
		Student st1 = new Student();
		Student st2 = new Student("Jānis", "Bērziņš", Faculty.ITF, "121200-12345");
		Student st3 = new Student("Līga", "Jaukā", Faculty.ITF, "121400-12345");
		
		Student[] allStudents = {st1, st2, st3};
		for(Student temp : allStudents)
		{
			System.out.println(temp);
		}
		for(int i = 0; i < allStudents.length;i++)
		{
			System.out.println(allStudents[i]);
		}
		ArrayList<Student> allStudentsList = new ArrayList<>();
		allStudentsList.addAll(Arrays.asList(st1, st2, st3));
		
		for(Student temp : allStudentsList) {
			System.out.println(temp);
		}
		for(int i = 0; i < allStudentsList.size();i++) {
			System.out.println(allStudentsList.get(i));
		}
		
		
		
		
		Professor pr1 = new Professor();

		Professor pr2 = new Professor("Karina", "Šķirmante", Degree.master);

		Professor pr3 = new Professor("Gaļina", "Hiļķeviča", Degree.phd);

		ArrayList<Professor> allProfessorList = new ArrayList<>();
		allProfessorList.addAll(Arrays.asList(pr1, pr2, pr3));
		
		for(Professor temp : allProfessorList)
		{
			System.out.println(temp);
		}
		
		
		
		Course c1 = new Course();
		Course c2 = new Course("Programmēšana tīmeklī JAVA", 4, CourseGradeType.EXAM, pr2);		
		Course c3 = new Course("Diferencialvienādojumi", 2, CourseGradeType.EXAM, pr3);
		Course c4 = new Course("Datu Struktūras un pamatalgoritmi", 2, CourseGradeType.EXAM, pr2);
		ArrayList<Course> allCourseList = new ArrayList<>();
		allCourseList.addAll(Arrays.asList(c1, c2, c3, c4));
		for(Course temp: allCourseList)
		{
			System.out.println(temp);
		}
		
		Grade gr1 = new Grade();
		Grade gr2 = new Grade(10, st2, c2);
		Grade gr3 = new Grade(6, st3, c2);
		Grade gr4  = new Grade(5, st2, c3);
		
		ArrayList<Grade> allGradesList = new ArrayList<>();
		allGradesList.addAll(Arrays.asList(gr1, gr2, gr3, gr4));
		
		
		
		
	}

}
