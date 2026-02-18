package com.manoa.order.dto;

public record FoodItemsDto(Long id,
        String name,
        String description,
        Boolean isVeg,
        Double price,
        Long restaurantId,
        Integer quantity) {
}
