package com.dragosmicroservice.orderservice.repository;

import com.dragosmicroservice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {
}
