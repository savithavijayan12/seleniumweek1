package week1.day2;

public class LibraryManagement{

	    public static void main(String[] args) {
	        Library library = new Library();
	        String bookName = library.addBook("Selenium Automation");
	        System.out.println("Book Title: " + bookName);
	        library.issueBook();
	    }
	}


