package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();

        Book book = new Book();
        book.setTitle("Java");
        book.setCost(20.5f);

        DigitalVideoDisc dvd = new DigitalVideoDisc();
        dvd.setTitle("Lion King");
        dvd.setCost(19.95f);

        CompactDisc cd = new CompactDisc();
        cd.setTitle("Music CD");
        cd.setCost(25.0f);

        cart.addMedia(book);
        cart.addMedia(dvd);
        cart.addMedia(cd);

        System.out.println("Total cost: " + cart.totalCost());

        cart.removeMedia(dvd);

        System.out.println("Total cost after remove: " + cart.totalCost());
    }
}