package Thuchanh.ss21_Design_Pattern.Trien_Khai_Singleton;

import java.awt.print.Book;

public class BookSingleton {

    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton() {
        author = "GAMMA, Helm, Johnson, and Vlissides";
        title = "Degirn Pattern";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }
}
