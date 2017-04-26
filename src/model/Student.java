package model;

public class Student extends Person{

	private int id;
	private static String schoolName;
	
	public Student(){}
	public Student(int id,String name,String gender,String phone){
		super(name,gender,phone);
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	 
}
