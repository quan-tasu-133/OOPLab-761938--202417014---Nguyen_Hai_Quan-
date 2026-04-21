package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();

        Book book = new Book(1, "Java", "IT", 20.5f);

        DigitalVideoDisc dvd =
            new DigitalVideoDisc(
                2,
                "Lion King",
                "Animation",
                19.95f,
                87,
                "Roger Allers"
            );

        CompactDisc cd =
            new CompactDisc(
                3,
                "Music CD",
                "Music",
                25.0f,
                60,
                "ABC",
                "Taylor Swift"
            );

        cart.addMedia(book);
        cart.addMedia(dvd);
        cart.addMedia(cd);

        System.out.println("Total cost: " + cart.totalCost());
    }
}