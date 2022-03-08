package oops.project;

public class Student {

	int stud_id;
	String stud_name;
	char stud_division;
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public char getStud_division() {
		return stud_division;
	}
	public void setStud_division(char stud_division) {
		this.stud_division = stud_division;
	}
	public Student(int stud_id, String stud_name, char stud_division) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_division = stud_division;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_division=" + stud_division + "]";
	}
	
	
}
