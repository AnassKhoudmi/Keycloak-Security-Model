package net.khoudmi.inventoryservice.repository;

import net.khoudmi.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
