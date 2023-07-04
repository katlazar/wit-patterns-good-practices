package pl.sdacademy.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {

    private List<Track> tracks = initPlayList();
    private static List<Track> initPlayList() {
        List<Track> items = new ArrayList<>();
        items.add(createTrack("Wednesday", "Paint It Black"));
        items.add(createTrack("Lindsey Stirling", "Underground"));
        items.add(createTrack("Einaudi", "Expecience"));
        items.add(createTrack("Ramin Djawadi", "The Night King"));
        items.add(createTrack("The Landing", "Justin Hurtwitz"));
        items.add(createTrack("John Williams", "The Imperial March"));
        items.add(createTrack("John Williams", "Duel of the Fates"));
        items.add(createTrack("John Williams", "Battle of the Heroes"));
        return items;
    }

    private static Track createTrack(String artist, String title) {
        return Track.builder()
                .artist(artist)
                .title(title)
                .build();
    }


    public void add(Track track) {
        tracks.add(track);
    }

    public void remove(Track track) {
        // aby zadzialalo musimy miec dobrze zaimplementowany kontrakt equals
        tracks.remove(track);
    }

    public List<Track> getTracks() {
        return Collections.unmodifiableList(tracks);
    }
}
