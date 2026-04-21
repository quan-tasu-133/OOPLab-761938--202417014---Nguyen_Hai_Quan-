package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Book;

public class StoreTest {
    public static void main(String[] args) {

        Store store = new Store();

        Book book = new Book();
        book.setTitle("Java");

        store.addMedia(book);
        store.removeMedia(book);
    }
}