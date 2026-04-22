package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {

        DigitalVideoDisc jungleDVD =
                new DigitalVideoDisc(1, "Jungle",
                        "Movie", 10f, 90, "A");

        DigitalVideoDisc cinderellaDVD =
                new DigitalVideoDisc(2, "Cinderella",
                        "Movie", 12f, 95, "B");

        swap(jungleDVD, cinderellaDVD);

        System.out.println("jungle dvd title: "
                + jungleDVD.getTitle());

        System.out.println("cinderella dvd title: "
                + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        System.out.println("jungle dvd title: "
                + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(
            DigitalVideoDisc dvd,
            String title) {

        DigitalVideoDisc newDVD =
                new DigitalVideoDisc(
                        dvd.getId(),
                        title,
                        dvd.getCategory(),
                        dvd.getCost(),
                        dvd.getLength(),
                        dvd.getDirector());

        dvd = newDVD;
    }
}