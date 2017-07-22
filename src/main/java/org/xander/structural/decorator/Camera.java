package org.xander.structural.decorator;

import java.awt.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Camera {
    private Function<Color, Color> filter;

    public Camera(){
        setFilters();
    }

    public Color capture(final Color inputColor) {
        final Color processedColor = filter.apply(inputColor);
        return processedColor;
    }

    public void setFilters(final Function<Color, Color>... filters) {
        filter = Stream.of(filters)
                .reduce((filter, next) -> filter.compose(next))
//                .orElse(color -> color);
                .orElseGet(Function::identity);
    }

    public static void main(String[] args) {
        Camera camera = new Camera();
        Consumer<String> consumer =
                (filterInfo) -> System.out.println(String.format("with %s: %s",
                                                                    filterInfo,
                                                                    camera.capture(new Color(200, 100, 200))));
        consumer.accept("no filter");

        camera.setFilters(Color::brighter);
        consumer.accept("brighther filter");

        camera.setFilters(Color::darker);
        consumer.accept("darker filter");

        camera.setFilters(Color::brighter, Color::darker);
        consumer.accept("brighter, darker filter");
    }
}
