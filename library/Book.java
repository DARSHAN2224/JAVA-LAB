package library;
public class Book {
	public static int c=0;
	private String title;
	public Book(String title){
		c++;
		this.title= title;
		System.out.println("book with title "+this.title+" is added to library");
	}
	public String get_title() {
		return title;
	}
}
