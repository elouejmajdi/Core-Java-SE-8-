package test.dataaccessobjectDAO;

import java.util.List;

public interface BookDAO {
	
	 List<Book> getAllBooks();
	    Book getBookByIsbn(int isbn);
	    void saveBook(Book book);
	    void deleteBook(Book book);
	

}
