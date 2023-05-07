package MarkerInterface1;

import java.util.ArrayList;
import java.util.List;


public class MarkerInterfaceEx1 {

	public static void main(String[] args) {
		 List<Book>books=new ArrayList<>();

	        books.add(new LibraryBook("My Favorite"," The Book Thief","Prince of Thrones \n"));
	        books.add(new LocalAuthor("RK Narayan"," The Guide \n"));
	        books.add(new EnglishAuthorBook("Shakespear","Hamlet"));
	            
	        BooksInfo.main(books);
 }
}
