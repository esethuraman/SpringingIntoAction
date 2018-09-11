package QualifiersAutowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("chocolate")
public class Chocolate implements Icecream {
    public void display() {
        System.out.println("Chocolate flavor");
    }
}
