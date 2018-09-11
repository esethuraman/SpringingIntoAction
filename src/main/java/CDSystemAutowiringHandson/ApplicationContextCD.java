package CDSystemAutowiringHandson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextCD {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CDConfig.class);
        context.refresh();

        CompactDisc compactDisc = context.getBean(CompactDisc.class);
        compactDisc.play();
    }
}
