package net.khoudmi.orderservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import net.khoudmi.orderservice.model.Product;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter
@Setter @ToString @Builder
public class ProductItem {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String productId;
  private double price;
  private int quantity;
  @ManyToOne
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private Order order;
  @Transient
  private Product product;
}
