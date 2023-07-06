package pl.sdacademy.practice;

import java.util.Map;
import java.util.function.Consumer;

public class PresenterFactory {

    private static final String SPACE = " ";

    static Consumer<Track> trackConsumerFactor(String selector) {
//        if ("first".equals(selector)) {
//            return System.out::println;
//        } else if ("second".equals(selector)) {
//            return MyPlayList::print;
//        } else if ("third".equals(selector)) {
//            return MyPlayList::printThird;
//        }

        Map<String, Consumer<Track>> myPresnters = Map.of(
                "first", System.out::println,
                "second", PresenterFactory::print,
                "third", PresenterFactory::printThird
        );
        return myPresnters.getOrDefault(selector, System.out::println);

//        throw new IllegalArgumentException("invalid presenter type");
    }

    private static void print(Track track) {
        System.out.println(track.getArtist() + SPACE + track.getTitle());
    }
    private static void printThird(Track track) {
        System.out.println("Artysta: "+track.getArtist());
        System.out.println("Tytuł:" + track.getTitle());
    }
}
