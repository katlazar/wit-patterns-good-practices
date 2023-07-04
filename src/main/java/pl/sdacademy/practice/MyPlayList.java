package pl.sdacademy.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MyPlayList {

    private static final String SPACE = " ";

    public static void main(String[] args) {
        List<Track> items = initPlayList();

        present(items, track -> System.out.println(track));

        shuffle(items);

        present(items, track -> System.out.println(track.getArtist() + SPACE + track.getTitle()));

    }

    private static void shuffle(List<Track> items) {
        Collections.sort(items, Comparator.nullsLast(Comparator.comparing(Track::getArtist)));
    }

    private static void present(List<Track> items, Consumer<Track> printer) {
        for (Track track : items) {
            printer.accept(track);
        }
    }

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
}
