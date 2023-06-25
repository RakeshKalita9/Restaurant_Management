package com.RestaurantManagementSystem2.RestaurantManagement2.Controller;

import com.RestaurantManagementSystem2.RestaurantManagement2.Model.Restaurant;
import com.RestaurantManagementSystem2.RestaurantManagement2.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResController {
    @Autowired
    RestaurantService restaurantService;
    //add Restaurant
    @PostMapping("restaurants")
    public String addRestaurant(@RequestBody List<Restaurant> restaurantList){
        return restaurantService.addNewRestaurant(restaurantList);
    }
    // get All Restaurant
    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }
    // get restaurant by id
    @GetMapping("restaurant/restaurantId/{resId}")
    public Restaurant getRestaurantById(@PathVariable Integer resId){
        return restaurantService.getRestaurantById(resId);
    }
    @PutMapping("restaurant/resId/{resId}/resSpeciality/{resSpeciality}")
    public String updateRestaurant(@PathVariable Integer resId,@PathVariable String resSpeciality){
        return  restaurantService.updateRestaurant(resId,resSpeciality);
    }
    @DeleteMapping("restaurant/resId/{resId}")
    public String deleteRestaurant(@PathVariable Integer resId){
       return  restaurantService.deleteRestaurant(resId);
    }



}
