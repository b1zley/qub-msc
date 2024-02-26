package library;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {
	Book book1;
	
	String validISBN1;
	String validAuthor;
	String validTitle;
	int validRating;
	

	ArrayList<Book> testLibrary;
	@BeforeEach
	void setUp() throws Exception {
		
		// this code block creates an array list of books called testLibrary
		// then adds the same book several times

		testLibrary = new ArrayList<Book>();
		
		validISBN1 = "0123456789";
		validAuthor = "validAuthor";
		validTitle = "validTitle";
		validRating = 1;
		
		
		
		
		book1 = new Book(validISBN1, validAuthor, validTitle, validRating);
		
		testLibrary.add(book1);
		testLibrary.add(book1);
		testLibrary.add(book1);
		testLibrary.add(book1);
		
		
	}
	
	
	// testing rating searches
	
	// negative testing, searching for rating value not present in books in arraylist
	
	@Test
	void testSearchPassedArrayListByRatingNotPresentInArrayList() {
		int ratingSearchKey = 3;
		
		ArrayList<Book> booksWithRatingValue3;
		
		booksWithRatingValue3 = LibrarySearch.searchByRating(testLibrary, ratingSearchKey);
		
		assertTrue(booksWithRatingValue3.isEmpty());
	}
	
	@Test
	void testSearchPassedArrayListByRatingPresentInArrayList() {
		
		
		
		int ratingSearchKey = 3;
		
		ArrayList<Book> booksWithRatingValue3;
		
		// generate a new book which matches search key
		Book testBookMatchingSearchKey = new Book();
		testBookMatchingSearchKey.setRating(ratingSearchKey);
		
		// add this book to the test library
		testLibrary.add(testBookMatchingSearchKey);
		
		// capture return value from search across testLibrary
		booksWithRatingValue3 = LibrarySearch.searchByRating(testLibrary, ratingSearchKey);
		
		
		// returned arrayList should have one element, equalling testBookMatchingSearchKey
		// generate a new arraylist only containing this element, then compare
		
		ArrayList<Book> testLibraryContainingRatingEquals3 = new ArrayList<Book>();
		testLibraryContainingRatingEquals3.add(testBookMatchingSearchKey);
		
		// arrayLists should evaluate to equal based on .equals method
		assertTrue(testLibraryContainingRatingEquals3.equals(booksWithRatingValue3));
	}
	
	
	
	

}
