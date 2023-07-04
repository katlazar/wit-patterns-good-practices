package pl.sdacademy.practice;

import java.util.Arrays;
import java.util.Comparator;

public class MyPlayList {

    public static void main(String[] args) {
        Track[] items = new Track[7];
        items[0] = createTrack("Wednesday", "Paint It Black");
        items[1] = createTrack("Lindsey Stirling", "Underground");
        items[2] = createTrack("Einaudi", "Expecience");
        items[3] = createTrack( "Ramin Djawadi", "The Night King");
        items[4] = createTrack( "The Landing", "Justin Hurtwitz");
        items[5] = createTrack( "John Williams", "The Imperial March");
        items[6] = createTrack( "John Williams", "Duel of the Fates");
//        items[7] = createTrack( "John Williams", "Battle of the Heroes");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getArtist()+" "+items[i].getTitle());
        }

        Arrays.sort(items, Comparator.nullsLast(Comparator.comparing(Track::getArtist)));

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                continue;
            }
            System.out.println(items[i].getArtist()+" "+items[i].getTitle());
        }

    }

    private static Track createTrack( String artist, String title) {
        Track f = new Track();
        f.setArtist(artist);
        f.setTitle(title);
        return f;
    }
}
