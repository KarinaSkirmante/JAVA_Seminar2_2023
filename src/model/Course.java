package model;

public class Course {
	//1.variables
	private long id;
	private String title; //only letters, digits and space
	private int creditPoints; //min = 1, max = 20
	private CourseGradeType type; //not null
	private Professor professor; //not null
	
	private static long courseCounter = 12000;
	
	//2.getters and setters
	public long getId() {
		return id;
	}
	public void setId() {
		this.id = courseCounter;
		courseCounter++;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String inputTitle) {
		if(inputTitle != null && inputTitle.matches("[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņA-ZĒŪĪĻĶĢŠĀŽČŅ0-9\\s]+")) {
			title = inputTitle;
		}
		else
		{
			title = "Unknown";
		}
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public void setCreditPoints(int inputCreditPoints) {
		if(inputCreditPoints > 0 && inputCreditPoints < 21) {
			creditPoints = inputCreditPoints;
		}
		else
		{
			creditPoints = 0;
		}
	}
	public CourseGradeType getType() {
		return type;
	}
	public void setType(CourseGradeType inputType) {
		if(inputType!=null) {
			type = inputType;
		}
		else
		{
			type = CourseGradeType.other;
		}
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor inputProfessor) {
		if(inputProfessor != null) {
			professor = inputProfessor;
		}
		else
		{
			professor = new Professor();//it will call Professor no-args constructor
		}
	}
	

	
	
	
	//3.constructors
	//4. toString
	//5. additional functions

}
