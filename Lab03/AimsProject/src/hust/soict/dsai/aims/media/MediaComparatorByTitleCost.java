package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {

        int titleResult =
            m1.getTitle().compareToIgnoreCase(m2.getTitle());

        if (titleResult != 0)
            return titleResult;

        return Float.compare(m1.getCost(), m2.getCost());
    }
}