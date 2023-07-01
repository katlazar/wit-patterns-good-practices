package pl.sdacademy.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GraphicCard2 {
    private int memoryInMb;
    private String producer;
    private String series;
    private String modelName;


}
