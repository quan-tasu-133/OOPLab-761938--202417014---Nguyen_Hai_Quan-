package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(int id, String title, String category,
                       float cost, int length,
                       String director, String artist) {

        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
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

    public void play() {
        System.out.println("Playing CD: " + this.getTitle());

        for (Track track : tracks) {
            track.play();
        }
    }
}