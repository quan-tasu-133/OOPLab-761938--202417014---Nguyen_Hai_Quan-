package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {

    private String director;
    private int length;

    public DigitalVideoDisc() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}