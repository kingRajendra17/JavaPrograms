package MarkerInterface1;
public class LocalAuthor implements Book{
	String authorName;
	String book;
	public LocalAuthor(String authorName,String book) {
		this.authorName=authorName;
		this.book=book;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	
}