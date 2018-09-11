package QualifiersAutowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("butterscotch")
public class Butterscotch implements Icecream{

    public void display() {
        System.out.println("Butterscotch flavor");
    }
}
