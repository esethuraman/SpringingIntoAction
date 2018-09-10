package PizzaStore;

import PizzaStore.Pizza.Pizza;
import PizzaStore.Restaurant.Restaurant;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(RestaurantConfig.class );
        context.refresh();

        Pizza pizza = context.getBean(Pizza.class);
        pizza.printPizzaInfo();

        Restaurant restaurantBean = context.getBean(Restaurant.class);
        restaurantBean.displayInfo();

        context.close();

    }
}
