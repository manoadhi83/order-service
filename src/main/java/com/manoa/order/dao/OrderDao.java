package com.manoa.order.dao;


import com.manoa.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderDao extends MongoRepository<Order, Long> {
}
