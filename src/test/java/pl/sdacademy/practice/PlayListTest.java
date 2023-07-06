package pl.sdacademy.practice;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayListTest {

    // System Under Test
    private PlayList sut = new PlayList();


    @Test
    void shouldReturnNumberOfTracksInPlaylist() {
        // brak sekcji given wskazuje na nienajlepszy kod klasy PlayList


        var result = sut.getSize();

        assertThat(result).isEqualTo(8);
    }

    @Test
    void shouldAddNewTrackToPlaylist() {
        assertThat(sut.getSize()).isEqualTo(8);
        var newTrack = Track.builder()
                .artist("test")
                .title("my song")
                .build();

        sut.add(newTrack);

        assertThat(sut.getSize()).isEqualTo(9);
        assertThat(sut.getTracks()).contains(newTrack);
    }

    @Test
    void shouldRemoveTrackFromPlayList() {
        assertThat(sut.getSize()).isEqualTo(8);
        // dobrze dobrane dane powoduja, ze mozemy testowac tak zlozone elementy jak equals/hashCode
        var trackToRemove = Track.builder()
                .artist("Einaudi")
                .title("Expecience")
                .build();


        sut.remove(trackToRemove);

        assertThat(sut.getSize()).isEqualTo(7);
    }
}