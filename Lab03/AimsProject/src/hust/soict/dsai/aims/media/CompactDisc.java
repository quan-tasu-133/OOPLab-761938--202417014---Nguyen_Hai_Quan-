package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Media {

    private String artist;
    private String director;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(int id, String title, String category,
                       String artist, String director, float cost) {
        super(id, title, category, cost);
        this.artist = artist;
        this.director = director;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public int getLength() {
        int total = 0;

        for (Track t : tracks) {
            total += t.getLength();
        }

        return total;
    }

    public String toString() {
        return super.toString() + " - " + artist + " - "
                + director + " - Length: " + getLength();
    }
}