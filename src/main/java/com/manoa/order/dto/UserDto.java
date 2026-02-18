package com.manoa.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public record UserDto(@JsonProperty("id") Long userId,
                      String userName,
                      @JsonIgnore String userPassword,
                      String address,
                      String city) {
}
