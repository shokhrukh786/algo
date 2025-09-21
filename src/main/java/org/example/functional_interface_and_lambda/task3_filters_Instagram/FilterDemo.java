package org.example.functional_interface_and_lambda.task3_filters_Instagram;

import java.util.function.Function;

public class FilterDemo {
    public static void main(String[] args) {
        FilterProcessor processor = new FilterProcessor();

        Image img = new Image("holiday.jpg", "Original rasm");

        //Filterlarni lambda orqali yozamiz.
        Function<Image, Image> blackWhite =
                (image) -> new Image(image.getName(), image.getDescription() + " | qora-oq filter");
        Function<Image, Image> sepia =
                (image) -> new Image(image.getName(), image.getDescription() + " | sepia");
        Function<Image, Image> vignette =
                (image) -> new Image(image.getName(), image.getDescription() + " | Vinyetka filter");

        // Bitta filtr qo‘llash
        Image image = processor.applyFilter(img, blackWhite);
        System.out.println(image);

        // Ikki filtrni ketma-ket ulash
        Function<Image, Image> comboFilter = processor.combineFilters(blackWhite, sepia);
        Image comboImage = processor.applyFilter(img, comboFilter);
        System.out.println(comboImage);

        // Uchta filtrni ham ulash mumkin
        Function<Image, Image> allFilters = blackWhite.andThen(sepia).andThen(vignette);
        Image finalImage = processor.applyFilter(img, allFilters);
        System.out.println(finalImage);

    }
}
