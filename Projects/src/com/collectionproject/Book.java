package com.collectionproject;

import java.util.ArrayList;
import java.util.Map;

public class Book {

	int book_id;
	String book_name;
	String book_status;
	Map<ArrayList<Book>,ArrayList<Student>> student;
	public Book(int book_id, String book_name, String book_status, Map<ArrayList<Book>, ArrayList<Student>> student) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_status = book_status;
		this.student = student;
	}
	public Book(int book_id, String book_name) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_status() {
		return book_status;
	}
	public void setBook_status(String book_status) {
		this.book_status = book_status;
	}
	public Map<ArrayList<Book>, ArrayList<Student>> getStudent() {
		return student;
	}
	public void setStudent(Map<ArrayList<Book>, ArrayList<Student>> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_status=" + book_status + ", student="
				+ student + "]";
	}
	 
}
