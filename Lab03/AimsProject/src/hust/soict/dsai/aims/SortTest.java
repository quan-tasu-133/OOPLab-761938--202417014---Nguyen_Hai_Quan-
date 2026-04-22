package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class SortTest {

    public static void main(String[] args) {

        List<Media> list = new ArrayList<Media>();

        list.add(new Book(1, "Java", "IT", 20f));
        list.add(new Book(2, "Python", "IT", 15f));
        list.add(new DigitalVideoDisc(
                3,
                "Lion King",
                "Animation",
                19.95f,
                87,
                "Roger"));

        System.out.println("Sort by title then cost:");
        Collections.sort(list, Media.COMPARE_BY_TITLE_COST);

        for (Media m : list) {
            System.out.println(m);
        }

        System.out.println();

        System.out.println("Sort by cost then title:");
        Collections.sort(list, Media.COMPARE_BY_COST_TITLE);

        for (Media m : list) {
            System.out.println(m);
        }
    }
}