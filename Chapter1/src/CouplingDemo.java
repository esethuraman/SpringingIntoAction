class CouplingDemo {

    CouplingDemo loose, tight;

    CouplingDemo(){

    }

    /*
        with the tight object, this class has to know about TightCouplingDemo
        but with loose object, this class is just aware of the interface
     */
    CouplingDemo(CouplingDemo loose){
        tight = new TightCouplingDemo();
        this.loose = loose;
    }

    public static void main(String[] args) {
        new CallerClass().execute();
    }

    void printInfo(){
        System.out.println("Print info from base class...");
        loose.printInfo();
        tight.printInfo();
    }
}

/*
this class is created just to make sure CouplingDemo class is completely unaware (loosely coupled) of the implementation
 class
 */
class CallerClass{
    void execute(){
        new CouplingDemo(new LooseCouplingDemo()).printInfo();
    }
}

class LooseCouplingDemo extends CouplingDemo {
    void printInfo(){
        System.out.println("I am from a loosely coupled class...");
    }
}


class TightCouplingDemo extends CouplingDemo {
    void printInfo(){
        System.out.println("I am from a tightly coupled class...");
    }
}
