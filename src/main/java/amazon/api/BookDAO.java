package amazon.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDAO {
	
	public static ArrayList<Book> books
	= new ArrayList<Book>() {{
		add(new Book("Super livre", 
		           "Marc Dupont", 
		           new Date(2016,5,10), 
		           "ISBN1251",
		           "Packt Publication",
		           220));
		add(new Book("Super livre", 
		           "Marc Dupont", 
		           new Date(2016,5,10), 
		           "ISBN1252",
		           "Packt Publication",
		           220));
		add(new Book("Super livre", 
		           "Marc Dupont", 
		           new Date(2016,5,10), 
		           "ISBN1253",
		           "Packt Publication",
		           220));
		add(new Book("Super livre", 
		           "Marc Dupont", 
		           new Date(2016,5,10), 
		           "ISBN1254",
		           "Packt Publication",
		           220));
		add(new Book("Super livre", 
		           "Marc Dupont", 
		           new Date(2016,5,10), 
		           "ISBN1255",
		           "Packt Publication",
		           220));
	}};
	
	public static List<Book> fetchAll() {
		// TODO Auto-generated method stub
		return BookDAO.books;
	}

	public static Book fetchOneByTitle(String title) {
		
		for(Book b : BookDAO.books) {
			if(b.getTitle() == title) {
				return b;
			}
		}
		
		return null;
	}
	
	public static Book fetchOneById(String id) {
		
		for(Book b : BookDAO.books) {
			if(b.getAsin() == id) {
				return b;
			}
		}
		
		return null;
	}

	public static List<Book> fetchAllByTitle(String title) {
		List<Book> result = new ArrayList<Book>();
		
		for(Book b : BookDAO.books) {
			if(b.getTitle() == title)
				result.add(b);
		}
		return result;
	}

}
