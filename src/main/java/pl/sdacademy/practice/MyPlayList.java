package pl.sdacademy.practice;

import java.util.*;

public class MyPlayList {

    public static void main(String[] args) {
        List<Track> items = new ArrayList<>();
        items.add(createTrack("Wednesday", "Paint It Black"));
        items.add(createTrack("Lindsey Stirling", "Underground"));
        items.add(createTrack("Einaudi", "Expecience"));
        items.add(createTrack( "Ramin Djawadi", "The Night King"));
        items.add(createTrack( "The Landing", "Justin Hurtwitz"));
        items.add(createTrack( "John Williams", "The Imperial March"));
        items.add(createTrack( "John Williams", "Duel of the Fates"));
        items.add(createTrack( "John Williams", "Battle of the Heroes"));

        for (Track track:  items) {
            System.out.println(track.getArtist()+" "+track.getTitle());
        }

        Collections.sort(items, Comparator.nullsLast(Comparator.comparing(Track::getArtist)));

        for (Track track:  items) {
            System.out.println(track.getArtist()+" "+track.getTitle());
        }

    }

    private static Track createTrack( String artist, String title) {
        Track f = new Track();
        f.setArtist(artist);
        f.setTitle(title);
        return f;
    }
}
