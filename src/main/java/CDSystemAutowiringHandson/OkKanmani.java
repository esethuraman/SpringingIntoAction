package CDSystemAutowiringHandson;

import org.springframework.stereotype.Component;

// Component is given a name that serves as an identifier
@Component("okKanmani")
public class OkKanmani implements CompactDisc {

    public void play() {
        System.out.println("Ablbum playing : OK Kanmani");
        System.out.println("Music Director : AR Rahman");
    }
}
