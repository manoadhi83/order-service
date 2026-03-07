package com.manoa.order.service.impl;

import com.manoa.order.dao.OrderDao;
import com.manoa.order.dto.AddOrderDto;
import com.manoa.order.dto.OrderDto;
import com.manoa.order.dto.UserDto;
import com.manoa.order.entity.Order;
import com.manoa.order.mapper.OrderMapper;
import com.manoa.order.service.OrderService;
import com.manoa.order.service.SequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Override
    public OrderDto addOrder(AddOrderDto orderDto) {

        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        UserDto userDto = fetchUserDetailsFromUserId(orderDto.userId());

        Order orderToBeSaved = new Order(newOrderID.longValue(), orderDto.foodItemsList(), orderDto.restaurant(), userDto);
        orderDao.save(orderToBeSaved);

        return orderMapper.toOrderDto(orderToBeSaved);
    }

    private UserDto fetchUserDetailsFromUserId(Integer userId) {
        return restTemplate.getForObject("http://user-service/api/users/" + userId, UserDto.class);
    }
}
