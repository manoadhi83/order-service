package com.manoa.order.dto;

import java.util.List;

public record OrderDto(Long orderId,
                       List<FoodItemsDto> foodItemsDto,
                       RestaurantDto restaurantDto,
                       UserDto userDto) {
}
