package pl.sdacademy.other;

public class MemoryPoolExample {

    public static void main(String[] args) {

        System.out.println("#### STINGS ####");
        String first = "test";
        String second = first;

        System.out.println(first.equals(second));
        System.out.println(first == second);

        second = "test";
        System.out.println(first.equals(second));
        System.out.println(first == second);

        second = new String("test");
        System.out.println(first.equals(second));
        System.out.println(first == second);

        System.out.println("\n#### NUMBERS ####\n");

        Integer one = 127;
        Integer two = one;
        System.out.println(one.equals(two));
        System.out.println(one == two);

        two = 127;
        System.out.println(one.equals(two));
        System.out.println(one == two);

        Integer three = 128;
        Integer four = 128;
        System.out.println(three.equals(four));
        System.out.println(three == four);

    }
}
