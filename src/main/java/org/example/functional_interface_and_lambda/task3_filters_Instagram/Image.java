package org.example.functional_interface_and_lambda.task3_filters_Instagram;

public class Image {
    private final String name;
    private final String description;

    public Image(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "📷 " + name + " [" + description + "]";
    }
}
