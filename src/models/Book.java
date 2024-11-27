package models;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isBorrowed;

    //Constructors
    public Book() {

    }

    public Book(String title, String author, int isbn, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    //Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nISBN: %d\nBorrowed: %b", title, author, isbn, isBorrowed);
    }
}
