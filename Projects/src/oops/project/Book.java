package oops.project;

public class Book {
	
	int book_id;
	String book_name;
	String book_status;
	Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
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
	
	public Book(int book_id, String book_name, String book_status, Student student) {
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
	public Book(int book_id, String book_name,String book_status) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_status = book_status;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_status=" + book_status + ", student="
				+ student + "]";
	}
	
}
