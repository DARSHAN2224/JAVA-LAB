package patron;
import library.Book;
public class Patron {
 public String name;
 
 Patron(String name){
	 this.name=name;
	 System.out.println("patron named "+this.name+" is added to patron");
 }
 public void borrowBook(Book b) {
	 System.out.println(name+" borrowed book title "+b.get_title());
 }
}
