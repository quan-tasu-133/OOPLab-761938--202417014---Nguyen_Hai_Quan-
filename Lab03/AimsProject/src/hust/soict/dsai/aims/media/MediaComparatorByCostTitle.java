package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    public int compare(Media m1, Media m2) {
        int result = Float.compare(m2.getCost(), m1.getCost());

        if (result == 0) {
            return m1.getTitle().compareTo(m2.getTitle());
        }

        return result;
    }
}