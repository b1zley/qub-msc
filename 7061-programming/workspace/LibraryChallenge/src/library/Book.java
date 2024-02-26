package library;

/**
 * Book class - represents a book in the system
 * 
 * @author amcgowan
 */
public class Book {

	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The autor of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;
	
	private int rating;
	
	
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) throws IllegalArgumentException {
		if (rating >= 1 && rating <= 5) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("only rating values between 1 and 5");
		}
	}

	/**
	 * Gets the ISBN number
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN number
	 * 
	 * @param iSBN
	 *            10 or 13 chars
	 * @throws Exception 
	 */
	public void setISBN(String iSBN) throws IllegalArgumentException {
		if(iSBN.length() == 10 || iSBN.length() == 13) {
			this.ISBN = iSBN;
		} else {
			throw new IllegalArgumentException("only ISBN values of length 10 or 13");
		}
			
		
	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author
	 * 
	 * @param author
	 */
	public void setAuthor(String author) throws IllegalArgumentException  {

			if(author.length() >= 1) {
				this.author = author;
			} else {
				throw new IllegalArgumentException("author field empty");
			}
			
		
	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title
	 * 
	 * @param title
	 */
	public void setTitle(String title) throws IllegalArgumentException {
			if (title.length() >= 1) {
				this.title = title;
			} else {
				throw new IllegalArgumentException("title field empty");
			}
			
		
	}
	
	
	/**
	 * Default constructor
	 */
	public Book() {

	}

	public Book(String iSBN, String author, String title, int rating) {
		this.setAuthor(author);
		this.setISBN(iSBN);
		this.setRating(rating);
		this.setTitle(title);
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", author=" + author + ", title=" + title + ", rating=" + rating + "]";
	}
	
	
	
	
	

	
}
