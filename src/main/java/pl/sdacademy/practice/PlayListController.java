package pl.sdacademy.practice;

import java.util.*;
import java.util.function.Consumer;

public class PlayListController {

    private final PlayList playList;
    private final List<Track> tracks;

    public PlayListController(PlayList playList) {
        this.playList = playList;
        this.tracks = new ArrayList<>(playList.getTracks());
    }

    public void shuffle() {
        Collections.sort(tracks, Comparator.nullsLast(Comparator.comparing(Track::getArtist)));
    }

    public void presentCurrent(Consumer<Track> printer) {
        for (Track track : tracks) {
            printer.accept(track);
        }
    }
    public void presentOriginal(Consumer<Track> printer) {
        for (Track track : playList.getTracks()) {
            printer.accept(track);
        }
    }

    public void add(Track track) {
        // miejsce na dodatkowe walidacje
        playList.add(track);
        tracks.add(track);
    }

    public void remove(Track track) {
        playList.remove(track);
        tracks.remove(track);
    }

    public Optional<Track> getTrack(int trackIndex) {
        if (trackIndex > playList.getSize() - 1 || trackIndex < 0) {
//            1 throw new IllegalArgumentException("nie ma utworu");
//            2 return playList.getTracks().get(0);
//            3 return null;
            return Optional.empty();
        }
        // chyba warto w PlayList tez zrobic metode getTrack
        // teraz lamiemy Prawo Demeter - kolejny principle :)
        return Optional.of(playList.getTracks().get(trackIndex));
    }
}
