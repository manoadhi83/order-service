package com.manoa.order.dto;

import java.util.List;

public record AddOrderDto(List<FoodItemsDto> foodItemsList,
                          Integer userId,
                          RestaurantDto restaurant) {
}
