package com.RestaurantManagementSystem2.RestaurantManagement2.Service;

import com.RestaurantManagementSystem2.RestaurantManagement2.Model.Restaurant;
import com.RestaurantManagementSystem2.RestaurantManagement2.Repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;
    public String addNewRestaurant(List<Restaurant> restaurantList) {
        restaurantRepo.restaurantList.addAll(restaurantList);
        return "restaurants are added";
    }

    public List<Restaurant> getAllRestaurant() {
        return restaurantRepo.restaurantList;
    }

    public Restaurant getRestaurantById(Integer resId) {
        for(Restaurant restaurant : restaurantRepo.restaurantList){
            if(restaurant.getResId().equals(resId)){
                return restaurant;
            }
        }
        return null;
    }

    public String updateRestaurant(Integer resId,String resSpeciality) {
       for(Restaurant restaurant1 : restaurantRepo.restaurantList){
           if(restaurant1.getResId().equals(resId)){
               restaurant1.setResSpeciality(resSpeciality);
               return "resSpeciality is updated SuccessFully";
           }
       }
       return "Invalid User_Id";
    }

    public String deleteRestaurant(Integer resId) {
        for(Restaurant restaurant : restaurantRepo.restaurantList){
            if(restaurant.getResId().equals(resId)){
                restaurantRepo.restaurantList.remove(restaurant);
                return "restaurant of Id "+resId+" removed Successfully";
            }
        }
        return "Invalid resId";
    }
}
