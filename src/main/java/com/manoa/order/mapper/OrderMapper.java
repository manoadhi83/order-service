package com.manoa.order.mapper;

import com.manoa.order.dto.OrderDto;
import com.manoa.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface OrderMapper {

   @Mapping(target = "orderId", source = "orderId")
   @Mapping(target = "foodItemsDto", source = "foodItemsDto")
   @Mapping(target = "restaurantDto", source = "restaurantDto")
   @Mapping(target = "userDto", source = "userDto")
   Order toOrder(OrderDto orderDto);

   @Mapping(target = "orderId", source = "orderId")
   @Mapping(target = "foodItemsDto", source = "foodItemsDto")
   @Mapping(target = "restaurantDto", source = "restaurantDto")
   @Mapping(target = "userDto", source = "userDto")
   OrderDto toOrderDto(Order order);
}
