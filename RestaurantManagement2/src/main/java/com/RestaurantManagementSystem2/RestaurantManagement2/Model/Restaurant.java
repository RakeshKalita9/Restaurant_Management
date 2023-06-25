package com.RestaurantManagementSystem2.RestaurantManagement2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Integer resId;
    private String resName;
    private String resSpeciality;
    private String reaAddress;
}
