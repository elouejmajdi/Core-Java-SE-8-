package test.dataaccessobjectDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BookDAOImpl implements BookDAO{

	
	public static List<Book> mybooks;
	
	public BookDAOImpl() {
		mybooks = new ArrayList<Book>();
		mybooks.add(new Book(1, "Java"));
		mybooks.add(new Book(2, "Python"));
		mybooks.add(new Book(3, "Android"));
	}
	
	
	
	

	public List<Book> getAllBooks() {
		
		return mybooks;
	}

	public Book getBookByIsbn(int isbn) {
		// TODO Auto-generated method stub
		return mybooks.get(isbn);
	}

	public void saveBook(Book book) {
		mybooks.add(book);
		
	}

	public void deleteBook(Book book) {
		mybooks.remove(book);
		
	}

	

		
	
	
	
	
	
	
	

}
