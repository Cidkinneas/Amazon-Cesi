package amazon.api;

import java.util.Date;

public class Book {
	
	private String title;
	private String author;
	private Date publicationDate;
	private String asin;
	private String publisher;
	private int pageNumber;
	
	public Book(
			String title, 
			String author, 
			Date publicationDate, 
			String asin, 
			String publisher, 
			int pageNumber) {

		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
		this.asin = asin;
		this.publisher = publisher;
		this.pageNumber = pageNumber;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publicationDate=" + publicationDate + ", asin=" + asin
				+ ", publisher=" + publisher + ", pageNumber=" + pageNumber + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asin == null) ? 0 : asin.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + pageNumber;
		result = prime * result + ((publicationDate == null) ? 0 : publicationDate.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (asin == null) {
			if (other.asin != null)
				return false;
		}
		return true;
	}

}
	