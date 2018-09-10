package PizzaStore;

import PizzaStore.Pizza.Pizza;
import PizzaStore.Restaurant.Restaurant;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// this file in Spring loads the beans and wire them together
// this in fact is one of the Spring container implementations
public class ApplicationContext {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(RestaurantConfig.class );
        context.refresh();

        // Wire the Pizza type object from Configuration class
        Pizza pizza = context.getBean(Pizza.class);
        pizza.printPizzaInfo();

        // Wire the Restaurant type object from Configuration class
        Restaurant restaurantBean = context.getBean(Restaurant.class);
        restaurantBean.displayInfo();

        context.close();

    }
}
