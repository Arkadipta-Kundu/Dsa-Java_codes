package opps;

interface vehicle {
    void wheels();
}

class Car implements vehicle {
    public void wheels() {
        System.out.println("Has 4 wheels ");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car c = new Car();
        c.wheels();
    }
}
