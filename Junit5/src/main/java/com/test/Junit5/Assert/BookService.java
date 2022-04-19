package com.test.Junit5.Assert;

import java.util.ArrayList;
import java.util.List;

public class BookService {
	
	private List<Book> lbook = new ArrayList<>();
	
	public List<Book> books() {
		Book book1= new Book(101,"Test 1","Ajay");
		lbook.add(book1);
		return lbook;
	}

}
