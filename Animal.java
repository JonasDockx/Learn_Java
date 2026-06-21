public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() { // a default: subclasses will override
        return name + " makes a sound";
    }
}
