package amazon.api;

public class BookController {

	public String fetchById(String id) {
		
		return BookDAO.fetchOneById(id).toString();
		
	}

}

