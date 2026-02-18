package com.manoa.order.service;

import com.manoa.order.dto.AddOrderDto;
import com.manoa.order.dto.OrderDto;
import com.manoa.order.entity.Order;

public interface OrderService {

    public OrderDto addOrder(AddOrderDto orderDto);
}
