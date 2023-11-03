package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flowers.items.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.items.FlowerColor;


import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 250;
    private static final int MAX_LENGTH = 250;
    private Flower flower;
    private int id = 100;

    @BeforeEach
    public void init() {
        int length = RANDOM_GENERATOR.nextInt(MAX_LENGTH);
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower = new Flower(length, FlowerColor.BLUE, price);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(flower.getPrice(), price);
    }
    @Test
    public void testId() {
        flower.setId(id);
        Assertions.assertEquals(flower.getId(), id);
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals(FlowerColor.RED, flower.getColor());

        FlowerColor color1 = FlowerColor.BLUE;
        flower.setColor(color1);
        Assertions.assertEquals(FlowerColor.BLUE, flower.getColor());
    }
}