package com.manoa.order.entity;

import com.manoa.order.dto.FoodItemsDto;
import com.manoa.order.dto.RestaurantDto;
import com.manoa.order.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

    private Long orderId;

    private List<FoodItemsDto> foodItemsDto;

    private RestaurantDto restaurantDto;

    private UserDto userDto;

}
