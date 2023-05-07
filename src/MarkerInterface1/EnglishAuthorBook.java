package MarkerInterface1;

public class EnglishAuthorBook implements Book {
	public String book;
	public String authorname;
	public EnglishAuthorBook(String book,String authorname) {
	this.authorname=authorname;
	this.book=book;

}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
}