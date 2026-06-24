public abstract class AnimalAbstract {  // can't be instantiated
    private String name;
    public AnimalAbstract(String name) { this.name = name; }
    public String getName() { return name; }

    public abstract String speak();     // no body - subclasses MUST implement
}
