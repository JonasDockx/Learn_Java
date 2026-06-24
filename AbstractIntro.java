public class AbstractIntro {
    public static void main(String[] args) {
        // Vehicle c = new Vehicle();   // uncomment later to see the error
        Car car = new Car();
        System.out.println(car.sound());    // vroom
        Bike bike = new Bike();
        System.out.println(bike.sound());
    }
}

abstract class Vehicle {    // cannot be instantiated
    abstract String sound();    // no body - subclasses must implement
}

class Bike extends Vehicle {
    @Override
    String sound() {
        return "ring";
    }
}
