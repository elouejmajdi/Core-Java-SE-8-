package test.dataaccessobjectDAO;

public class Book {

	private int ISBN;

	private String name;
	
	
	
	

	public Book(int iSBN, String name) {
		super();
		ISBN = iSBN;
		this.name = name;
	}

	public int getISBN() {
		return ISBN;
	}

	public String getName() {
		return name;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public void setName(String name) {
		this.name = name;
	}
}
