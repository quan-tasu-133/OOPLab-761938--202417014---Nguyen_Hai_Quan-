package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {

    private String director;
    private int length;

    public DigitalVideoDisc(int id, String title, String category,
                            String director, int length, float cost) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return super.toString() + " - " + director + " - " + length;
    }
}