package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc() {
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added");
        } else {
            System.out.println("Track already exists");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed");
        } else {
            System.out.println("Track not found");
        }
    }

    public int getLength() {
        int total = 0;

        for (Track t : tracks) {
            total += t.getLength();
        }

        return total;
    }
}