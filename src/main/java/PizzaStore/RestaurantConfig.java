package PizzaStore;

import PizzaStore.Pizza.ItalianPizza;
import PizzaStore.Pizza.NYPizza;
import PizzaStore.Pizza.Pizza;
import PizzaStore.Restaurant.Restaurant;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantConfig {
    @Bean
    public Pizza nyPizza(){
        return new NYPizza();
    }


    @Bean
    public Restaurant restaurant(){
        return new Restaurant(nyPizza());
    }
}
