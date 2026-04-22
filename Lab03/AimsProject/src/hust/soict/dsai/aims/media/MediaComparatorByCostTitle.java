package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {

        int costResult =
            Float.compare(m2.getCost(), m1.getCost());

        if (costResult != 0)
            return costResult;

        return m1.getTitle().compareToIgnoreCase(m2.getTitle());
    }
}