package ua.edu.ucu.apps.flowerstore.flowers.items;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation.toUpperCase();
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}