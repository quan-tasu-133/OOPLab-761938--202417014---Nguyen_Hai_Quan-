package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.Collections;

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

    public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("The cart has been sorted by title");
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("The cart has been sorted by cost");
    }

    public void print() {
        System.out.println("***********************CART***********************");

        for (Media media : itemsOrdered) {
            System.out.println(media.getTitle() + " - " + media.getCost() + " $");
        }

        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }
}