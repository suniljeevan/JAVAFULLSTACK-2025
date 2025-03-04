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
		System.out.println(strings);
	}

}
