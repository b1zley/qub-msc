package library;

import java.util.ArrayList;

/**
 * Class enables various utility searches in libary books
 * @author aidan
 *
 */
public class LibrarySearch {

	
	/**
	 * Search by title
	 * @param title - String
	 * @return ArrayList of found books matching search criteria
	 */
	public static ArrayList<Book> searchByTitle(ArrayList<Book> allBooks, String title) {
		ArrayList<Book> results = new ArrayList<Book>();
		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getTitle().equals(title)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}

	/**
	 * Search by Author
	 * @param author - string
	 * @return ArrayList of found books matching search criteria
	 */
	public static ArrayList<Book> searchByAuthor(ArrayList<Book> allBooks, String author) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getAuthor().equals(author)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}
	
	public static ArrayList<Book> searchByRating(ArrayList<Book> allBooks, int ratingSearchKey){
		ArrayList<Book> booksContainingSearchKey = new ArrayList<Book>();
		
		for (Book book : allBooks) {
			if (book.getRating() == ratingSearchKey) {
				booksContainingSearchKey.add(book);
			}
		}
		
		
		return booksContainingSearchKey;
		
	}
	
	
	public static ArrayList<Book> searchByISBN(ArrayList<Book> allBooks, String iSBNSearchKey){
		ArrayList<Book> booksContainingSearchKey = new ArrayList<Book>();
		
		for (Book book : allBooks) {
			if (book.getISBN().equals(iSBNSearchKey)) {
				booksContainingSearchKey.add(book);
			}
		}
		
		
		return booksContainingSearchKey;
		
	}
	
	
	
	
	
}
