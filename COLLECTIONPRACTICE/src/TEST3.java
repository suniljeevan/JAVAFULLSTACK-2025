//Practice Set Collection for Custom object
import java.util.*;
class Book implements Comparable<Book>{
	private int bookId;
	private String bookTitle;
	private String publisher;
	private double price;
	private int edition;
	private int publishedYear;
	//alt shift s
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	public Book(int bookId, String bookTitle, String publisher, double price, int edition, int publishedYear) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.publisher = publisher;
		this.price = price;
		this.edition = edition;
		this.publishedYear = publishedYear;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", publisher=" + publisher + ", price=" + price
				+ ", edition=" + edition + ", publishedYear=" + publishedYear + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookId, bookTitle, edition, price, publishedYear, publisher);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookId == other.bookId && Objects.equals(bookTitle, other.bookTitle) && edition == other.edition
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& publishedYear == other.publishedYear && Objects.equals(publisher, other.publisher);
	}
	public int compareTo(Book b) {
		return Integer.compare(bookId, b.getBookId());
	}
}
public class TEST3 {
	public static void main(String[] args) {
		Set<String> strings=new HashSet<String>();
		strings.add("sunil");
		strings.add("anil");
		strings.add("ajith");
		strings.add("akram");
		// insertion order is not preserved
		System.out.println(strings);
		Set<Book> books=new HashSet<Book>();
		books.add(new Book(1001,"Pride and Prejudice","whitehall",823,1,1813));
		books.add(new Book(1001,"The great gatsby","whitehall",1000,1,1900));
		books.add(new Book(1003,"To kill a mockingbird","Roll books",823,1,1913));
		books.add(new Book(1004,"1984","Rupa Publication",823,1,1913));
		books.add(new Book(1005,"Animal Farm","Apk Publishers",823,1,1927));
		books.add(new Book(1006,"Anna Karenina","Agarwal Publishers",823,2,1923));
		System.out.println(books);
		//Set never allow duplicates
	}

}
