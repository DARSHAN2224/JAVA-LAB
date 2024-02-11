package patron;
import library.Book;
public class Demo_lab6_a {

	public static void main(String[] args) {
		Book b1=new Book("java notes");
		Book b2=new Book("dsa notes");
		System.out.println("number of books in libray is "+Book.c);
		Patron p1=new Patron("Alice"); 
		p1.borrowBook(b1);
		p1.borrowBook(b2);
	}

}
