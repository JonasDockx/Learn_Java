public class Cow extends Animal { // Cow IS-A Animal
    public Cow(String name) {
        super(name);            // call Animal's constructor
    }

    @Override
    public String speak() {     // replace the inherited behaviour
        return getName() + " says moo";
    }
}
