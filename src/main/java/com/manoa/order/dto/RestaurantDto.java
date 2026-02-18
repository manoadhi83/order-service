package com.manoa.order.dto;

public record RestaurantDto(Long restaurantId,
        String name,
        String address,
        String city,
        String description) {
}
