package pl.sdacademy.builder;

public class GraphicCardUsage {

    public static void main(String[] args) {
        var myCard = new GraphicCard("GeForce", "nie wiem");


        System.out.println(myCard);

        var builder = GraphicCardWithBuild.builder();
        var builder2 = GraphicCardWithBuild.builder();
        System.out.println(builder2 == builder);

        var myCardBuilt = GraphicCardWithBuild.builder()
                .producer("GeForce")
                .modelName("nie wiem")
                .memoryInMb(1000)
//                .producer("a jednak nie wiem")
                .build();

        System.out.println(myCardBuilt);

        var cardWithLombokBuilder = GraphicCard2.builder()
                .producer("GeForce")
                .modelName("nie wiem")
                .memoryInMb(1000)
                .build();

        System.out.println(cardWithLombokBuilder);

    }
}
