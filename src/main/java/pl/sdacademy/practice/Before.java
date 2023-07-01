package pl.sdacademy.practice;

import java.util.Arrays;
import java.util.Comparator;

public class Before {

    public static void main(String[] args) {
        MyItem[] items = new MyItem[10];
        MyItem f = new MyItem();
        f.setA("Paint It Black");
        f.setT("Wednesday");
        items[0] = f;
        f = new MyItem();
        f.setA("Lindsey Stirling");
        f.setT("Underground");
        items[1] = f;
        f = new MyItem();
        f.setA("Einaudi");
        f.setT("Expecience");
        items[2] = f;
        f = new MyItem();
        f.setA("Ramin Djawadi");
        f.setT("The Night King");
        items[3] = f;
        f = new MyItem();
        f.setA("The Landing");
        f.setT("Justin Hurtwitz");
        items[4] = f;
        f = new MyItem();
        f.setA("John Williams");
        f.setT("The Imperial March");
        items[5] = f;
        f = new MyItem();
        f.setA("John Williams");
        f.setT("Duel of the Fates");
        items[6] = f;

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getA()+" "+items[i].getT());
        }

        Arrays.sort(items, Comparator.nullsLast(Comparator.comparing(MyItem::getA)));

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getA()+" "+items[i].getT());
        }

    }
}
