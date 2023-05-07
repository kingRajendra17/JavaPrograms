package MarkerInterface1;

public class LibraryBook implements Book {
	
	public String comics;
	public String novels;
	public String fantasy;
	public LibraryBook(String comics,String novels,String fantasy) {
		this.comics=comics;
		this.novels=novels;
		this.fantasy=fantasy;
	}
	public String getComics() {
		return comics;
	}
	public void setComics(String comics) {
		this.comics = comics;
	}
	public String getNovels() {
		return novels;
	}
	public void setNovels(String novels) {
		this.novels = novels;
	}
	public String getFantasy() {
		return fantasy;
	}
	public void setFantasy(String fantasy) {
		this.fantasy = fantasy;
	}
}