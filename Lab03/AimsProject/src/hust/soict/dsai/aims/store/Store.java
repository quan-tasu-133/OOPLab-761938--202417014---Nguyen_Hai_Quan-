package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {

    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public Store() {
    }

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The media has been added");
    }

    public void removeMedia(Media media) {
        itemsInStore.remove(media);
        System.out.println("The media has been removed");
    }

    public void print() {
        System.out.println("****************STORE****************");

        for (Media media : itemsInStore) {
            System.out.println(media);
        }

        System.out.println("*************************************");
    }

    public Media search(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}