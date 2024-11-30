package models;
import services.Library;

import java.util.ArrayList;

public abstract class User {
    private String name;
    private String userId;
    private ArrayList<Book> borrowedBooks;

    public abstract void borrowBook(Book book, Library library);
    public abstract void returnBook(Book book, Library library);

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String toString() {
        return "Name: " + name + "\nUser ID: " + userId + "\nBorrowed Books: " + borrowedBooks;
    }
}
