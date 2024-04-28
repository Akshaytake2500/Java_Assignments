package BookLibrary;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;
	private static int counter = 0;	
	public Book(int bookId, String title, String author, boolean isAvailable) {
		super();
		counter++;
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

    public static int getBookCount() {
        return counter++;
    }
	
	public void displayInfo() {
          System.out.println( "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable
				+ "]");
	}

}
