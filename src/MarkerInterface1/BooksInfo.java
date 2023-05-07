package MarkerInterface1;

import java.util.List;


public class BooksInfo {
    public static void main(List<Book> books) {

        for (Book book : books) {
            if (book instanceof LibraryBook) {
                LibraryBook libraryBook=(LibraryBook) book;
                System.out.println("Novel is : "+libraryBook.getNovels());
                System.out.println("Comics is : "+libraryBook.getComics());
                System.out.println("Fantasy is : "+libraryBook.getFantasy());

            }else if (book instanceof LocalAuthor){
            	LocalAuthor localAuthor=(LocalAuthor) book;
                System.out.println("LocalAuthor Name is :"+localAuthor.getAuthorName());
                System.out.println("LocalAuthor Book is :"+localAuthor.getBook());


            }
            else if (book instanceof EnglishAuthorBook){
                EnglishAuthorBook englishAuthorBook=(EnglishAuthorBook) book;
                System.out.println("EnglishAuthor Name is :"+englishAuthorBook.getAuthorname());
                System.out.println("EnglishAuthor Book is :"+englishAuthorBook.getBook());


            }
            else {
                System.out.println("Unknown Book Type");
        }
    }
}
}