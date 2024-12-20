package net.khoudmi.orderservice.repositories;

import net.khoudmi.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
