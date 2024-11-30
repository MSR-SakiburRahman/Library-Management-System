import models.Book;
import services.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Atomic Habits", "James Clear", 0000001, false));
        library.addBook(new Book("Atomic Habits", "James Clear", 0000001, false));
    }
}