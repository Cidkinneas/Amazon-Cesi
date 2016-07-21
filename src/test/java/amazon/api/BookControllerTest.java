package amazon.api;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class BookControllerTest {
	
	private BookController bc;
	
	@Before
	public void setUp() {
		bc = new BookController();
	}
	
	@Test
	public void testGetAllBook() {
		System.out.println("testGetAllBook");
		
		String expected = "Book [title=Super livre, author=Marc Dupont, publicationDate=" + new Date(2016,5,10) + ", asin=ISBN1251, publisher=Packt Publication, pageNumber=220]";
		String result = this.bc.fetchById("ISBN1251");
		
		assertEquals(expected, result);
		
	}

}
