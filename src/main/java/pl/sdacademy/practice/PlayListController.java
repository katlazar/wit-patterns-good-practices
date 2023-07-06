package pl.sdacademy.practice;

import java.util.Optional;

public class PlayListController {

    private final PlayList playList;

    public PlayListController(PlayList playList) {
        this.playList = playList;
    }

    public void add(Track track) {
        // miejsce na dodatkowe walidacje
        playList.add(track);
    }

    public void remove(Track track) {
        playList.remove(track);
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
