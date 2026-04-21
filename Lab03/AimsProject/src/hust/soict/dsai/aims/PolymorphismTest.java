package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class PolymorphismTest {
    public static void main(String[] args) {

        List<Media> mediae = new ArrayList<Media>();

        Book book = new Book(1, "Java", "IT", 20f);

        DigitalVideoDisc dvd =
            new DigitalVideoDisc(2, "Lion King",
                    "Animation", 19.95f, 87, "Roger Allers");

        CompactDisc cd =
            new CompactDisc(3, "Music CD",
                    "Music", 25f, 60, "ABC", "Taylor");

        mediae.add(book);
        mediae.add(dvd);
        mediae.add(cd);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}