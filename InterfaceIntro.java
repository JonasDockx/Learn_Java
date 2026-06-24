public class InterfaceIntro {
    public static void main(String[] args) {
        Switchable lamp = new Lamp();   // a Lamp IS-A Switchable
        System.out.println(lamp.turnOn());
        Switchable fan = new Fan();
        System.out.println(fan.turnOn());
    }
}

interface Switchable {  // the contract
    String turnOn();    // no body - implementers must provide it
}

class Lamp implements Switchable {  // signs the contract
    @Override
    public String turnOn() {    // must be public (interface methods are public)
        return "Lamp is on";
    }
}

class Fan implements Switchable {
    @Override
    public String turnOn() {
        return "Fan is spinning";
    }
}
