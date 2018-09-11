package QualifiersAutowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pistachio")
public class Pistachio implements Icecream {

    public void display() {
        System.out.println("Pistachio flavor");
    }
}
