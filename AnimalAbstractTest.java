public class AnimalAbstractTest {
    public static void main(String[] args) {
        AnimalAbstract a = new AnimalAbstract("Thing"); // COMPILE ERROR - Animal is abstract
        AnimalAbstract b = new Dog("Rex");      // a concrete subclass is fine
    }
}
