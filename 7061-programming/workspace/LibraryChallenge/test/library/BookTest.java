package library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
	
	Book testBook;
	
//	String testAuthor;
//	String testTitle;
//	String testISBN;
//	int testRating;

	@BeforeEach
	void setUp() throws Exception {
		
		testBook = new Book();
	}


	
	@Test
	void testSetAndGetAuthorValidValues() {
		// valid values = any string that has more than 0 characters
		
		//test1 input data
		String validTestAuthorLength5 = "AbCdE";
		//test2 input data
		String validTestAuthorLength1 = "A";
		//test3 input data
		String validTestAuthorLength1SpecialCharacter = "!";
		
		// test1 
		testBook.setAuthor(validTestAuthorLength5);
		assertEquals(validTestAuthorLength5, testBook.getAuthor());
		
		//test2
		testBook.setAuthor(validTestAuthorLength1);
		assertEquals(validTestAuthorLength1, testBook.getAuthor());
		
		//test3
		testBook.setAuthor(validTestAuthorLength1SpecialCharacter);
		assertEquals(validTestAuthorLength1SpecialCharacter, testBook.getAuthor());
		
	}
	
	@Test
	void testSetAndGetAuthorInvalidValues() {
		// invalid values = empty strings
		//test1 input data
		String invalidTestAuthorLength0 = "";
		
		//test that exception is thrown with invalid argument
		assertThrows(Exception.class, () -> {
			testBook.setAuthor(invalidTestAuthorLength0);
		});
		
		// test that author has not been set when setAuthor() is called with invalid argument
		assertNull(testBook.getAuthor());
		
	}
	
	
	

}
