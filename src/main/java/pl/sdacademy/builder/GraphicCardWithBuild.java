package pl.sdacademy.builder;

import lombok.Data;

@Data
public class GraphicCardWithBuild {
    private int memoryInMb;
    private String producer;
    private String series;
    private String modelName;

    private GraphicCardWithBuild() {

    }

    public static GraphicCardWithBuildBuilder builder() {
        return new GraphicCardWithBuildBuilder();
    }

    public static final class GraphicCardWithBuildBuilder {
        private int memoryInMb;
        private String producer;
        private String series;
        private String modelName;

        private GraphicCardWithBuildBuilder() {
        }


        public GraphicCardWithBuildBuilder memoryInMb(int memoryInMb) {
            this.memoryInMb = memoryInMb;
            return this;
        }

        public GraphicCardWithBuildBuilder producer(String producer) {
            this.producer = producer;
            return this;
        }

        public GraphicCardWithBuildBuilder series(String series) {
            this.series = series;
            return this;
        }

        public GraphicCardWithBuildBuilder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public GraphicCardWithBuild build() {
            // dodatkowe sprawdzanie - walidacje
            if (producer == null || modelName == null) {
                throw new IllegalArgumentException("Producer and model must be set");
            }
            GraphicCardWithBuild graphicCardWithBuild = new GraphicCardWithBuild();
            graphicCardWithBuild.setMemoryInMb(memoryInMb);
            graphicCardWithBuild.setProducer(producer);
            graphicCardWithBuild.setSeries(series);
            graphicCardWithBuild.setModelName(modelName);
            return graphicCardWithBuild;
        }
    }
}


