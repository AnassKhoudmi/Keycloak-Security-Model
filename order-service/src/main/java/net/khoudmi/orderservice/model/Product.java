package net.khoudmi.orderservice.model;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor @Getter
@Setter @ToString @Builder
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
