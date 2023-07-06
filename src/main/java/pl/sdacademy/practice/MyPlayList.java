package pl.sdacademy.practice;

import static pl.sdacademy.practice.PresenterFactory.trackConsumerFactor;

public class MyPlayList {



    public static void main(String[] args) {
        String selector = args.length == 0 ? "first" : args[0];
        /*
        String selector;
        if (args.length == 0) {
        selector = "first";
        }
        else {
        selector = args[0];
        }
         */

        PlayListController controller = new PlayListController(new PlayList());

        controller.presentCurrent(trackConsumerFactor(selector));

        controller.shuffle();
        System.out.println("\n### po shuffle ###\n");
        controller.presentCurrent(trackConsumerFactor(selector));
        System.out.println("\n### a tu oryginalne ###\n");
        controller.presentOriginal(trackConsumerFactor(selector));

    }
}
