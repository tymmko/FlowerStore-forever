package ua.edu.ucu.apps.flowerstore.flowers.items;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Getter @NoArgsConstructor
@Entity @Setter
public class Flower {
    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;

    public Flower(double sepalLength, FlowerColor color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }
}
