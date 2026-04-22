package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Book;

public class StoreTest {

    public static void main(String[] args) {

        Store store = new Store();

        Book book = new Book(1, "Java", "IT", 20f);

        store.addMedia(book);
        store.removeMedia(book);
    }
}