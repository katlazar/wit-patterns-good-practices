package pl.sdacademy.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MyPlayList {

    private static final String SPACE = " ";

    public static void main(String[] args) {
        // klasa 1 - PlayList
        PlayList playList = new PlayList();
        List<Track> items = playList.getTracks();

        // to chyba player? - PlayListController
        present(items, System.out::println);

        Track secondTrack = playList.getTracks().get(1);
        System.out.println("\n ==== ZMIANA ===== \n");
        System.out.println(secondTrack);
        secondTrack.setArtist("Mozart");

        System.out.println(secondTrack);

        present(items, System.out::println);

        Track thirdTrack = Track.builder()
                .artist("Einaudi")
                .title("Expecience")
                .build();
        playList.remove(thirdTrack);
        System.out.println("\n ==== PO KASOWANIU ===== \n");
        present(items, System.out::println);

//        shuffle(items);
//
//        present(items, MyPlayList::print);

    }

    private static void print(Track track) {
        System.out.println(track.getArtist() + SPACE + track.getTitle());
    }

    private static void shuffle(List<Track> items) {
        Collections.sort(items, Comparator.nullsLast(Comparator.comparing(Track::getArtist)));
    }

    private static void present(List<Track> items, Consumer<Track> printer) {
        for (Track track : items) {
            printer.accept(track);
        }
    }

}
