package hust.soict.dsai.aims;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Cart {

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public Cart() {
    }

    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("The media has been added");
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
        System.out.println("The media has been removed");
    }

    public float totalCost() {
        float total = 0;

        for (Media media : itemsOrdered) {
            total += media.getCost();
        }

        return total;
    }
}