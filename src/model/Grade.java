package model;

public class Grade {
	//1.variables
	private long id;
	private int grValue;
	private Student student;
	private Course course;
	
	private static long gradeCounter = 15000;
	//2.getters and setters

	public long getId() {
		return id;
	}

	public void setId() {
		this.id = gradeCounter++;
	}

	public int getGrValue() {
		return grValue;
	}

	public void setGrValue(int inputGrValue) {
		if(inputGrValue > 0 && inputGrValue <= 10) {
			grValue = inputGrValue;
		}
		else
		{
			grValue = 0;
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student inputStudent) {
		if(inputStudent != null)
		{
			student = inputStudent;
		}
		else
		{
			student = new Student();
		}
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course inputCourse) {
		if(inputCourse != null) {
			course = inputCourse;
		}
		else
		{
			course = new Course();
		}
	}
	
	
	
	
	//3.constructors
	
	//4.toString
	
	//5.additional functions

}
