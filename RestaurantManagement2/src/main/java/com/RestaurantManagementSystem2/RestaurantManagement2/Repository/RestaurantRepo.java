package com.RestaurantManagementSystem2.RestaurantManagement2.Repository;

import com.RestaurantManagementSystem2.RestaurantManagement2.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepo {
    @Autowired
   public List<Restaurant> restaurantList;
}
