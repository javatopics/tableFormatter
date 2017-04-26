package model;

public class Person {

	private String name;
	private String gender;
	private String phoneNumber;
	
	public Person(){}
	public Person(String name,String gender ,String phone){
		this.name=name; this.gender=gender;this.phoneNumber=phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
