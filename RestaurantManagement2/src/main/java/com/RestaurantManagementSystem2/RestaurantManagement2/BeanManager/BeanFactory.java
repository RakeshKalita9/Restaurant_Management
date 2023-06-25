package com.RestaurantManagementSystem2.RestaurantManagement2.BeanManager;

import com.RestaurantManagementSystem2.RestaurantManagement2.Model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeanFactory {
    @Bean
    public ArrayList<Restaurant> returnBean(){
        return new ArrayList<>();
    }
}
