package com.jdbctutorial.JDBC;

public class StudentsImg {

	private String stud_name;
	private String stud_img;
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_img() {
		return stud_img;
	}
	public void setStud_img(String stud_img) {
		this.stud_img = stud_img;
	}
	public StudentsImg(String stud_name, String stud_img) {
		super();
		this.stud_name = stud_name;
		this.stud_img = stud_img;
	}
	public StudentsImg() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentsImg [stud_name=" + stud_name + ", stud_img=" + stud_img + "]";
	}
}
