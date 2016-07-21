package amazon.api;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class BookAPI {

	@SuppressWarnings("deprecation")
	@Test
	public void testAllBooks() {
		System.out.println("testAllBooks");
		
		List<Book> expected = new ArrayList<Book>();
		
		for (int i = 1; i < 6; i++) {
			expected.add(new Book("Super livre", 
					           "Marc Dupont", 
					           new Date(2016,5,10), 
					           "ISBN125"+ i,
					           "Packt Publication",
					           220));
		}
		
		List<Book> result = BookDAO.fetchAll();
		
		assertEquals(expected.size(), result.size());
		
		for (int i = 0; i < result.size(); i++) {
			assertEquals(result.get(i), expected.get(i));
		}
	}
	
	@Test
	public void testOneBookByTitle() {
		System.out.println("testOneBookByTitle");
		
		Book expected = BookDAO.books.get(0);
		
		Book result = BookDAO.fetchOneByTitle(expected.getTitle());
		
		assertEquals(expected, result);
		assertNull(BookDAO.fetchOneByTitle("dqsdqsd"));
		
	}
	
	@Test
	public void testOneBookById() {
		System.out.println("testOneBookById");
		
		Book expected = BookDAO.books.get(0);
		
		Book result = BookDAO.fetchOneById(expected.getAsin());
		
		assertEquals(expected, result);
		assertNull(BookDAO.fetchOneById("dqsdqsd"));
		
	}
	
	@Test
	public void testAllBookByTitle() {
		
		System.out.println("testAllBookByTitle");
		
		List<Book> expd = BookDAO.books;
		List<Book> result = BookDAO.fetchAllByTitle("Super livre");
		
		assertEquals(expd.size(), result.size());
		
		for (int i = 0; i < result.size(); i++) {
			assertEquals(expd.get(i), result.get(i));
		}
		
		result = BookDAO.fetchAllByTitle("dqsdsqdsdsqd");
		assertTrue(result.isEmpty());
	}

}
