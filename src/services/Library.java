package services;
import models.Book;
import models.User;

import java.util.ArrayList;

public class Library {
    static ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {


        if (book == null) {
            throw new IllegalArgumentException("Book can not be null!");
        }

        for (Book existingBooks : books) {
            if (existingBooks.getIsbn() == (book.getIsbn())) {
                throw new IllegalArgumentException("Book: " + book + " already exists!");
            }
        }


        books.add(book);
    }

    public ArrayList<Book> listCurrentlyAvailable() {
        ArrayList<Book> availableBooks = new ArrayList<>();

        for(Book book: books) {
            if(!book.getIsBorrowed()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public static int countBooks() {
        return books.size();
    }


}
