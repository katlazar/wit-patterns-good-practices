package pl.sdacademy.builder;

import lombok.Data;

@Data
public class GraphicCard {
    private int memoryInMb;
    private String producer;
    private String series;
    private String modelName;

    public GraphicCard(String producer, String modelName) {
        if (producer == null) {
            throw new IllegalArgumentException("Producer must be set");
        }
        this.producer = producer;
        this.modelName = modelName;
    }

}
