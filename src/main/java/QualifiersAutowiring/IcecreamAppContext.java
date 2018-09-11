package QualifiersAutowiring;

import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IcecreamAppContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(IcecreamConfig.class);
        context.refresh();

        // here we are getting the bean based on qualifier name
        Icecream icecream = BeanFactoryAnnotationUtils.qualifiedBeanOfType(
                context.getBeanFactory(), Icecream.class, "pistachio");
        icecream.display();

        // here, while we simply get the bean, chocolate flavor is returned as it is set to be the @Primary bean
        icecream = context.getBean(Icecream.class);
        icecream.display();
    }
}
