public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Dog("Rex");
        Animal b = new Cat("Mittens");

        System.out.println(a.speak());  // Rex says woof (Dog's version)
        System.out.println(b.speak());  // Mittens says meow (Cat's version)

        // The payoff: one loop, any animal
        Animal[] zoo = { new Dog("Rex"), new Cat("Mittens"), new Animal("Thing"), new Cow("Bella") };
        for (Animal animal : zoo) {
            System.out.println(animal.speak());     // each speaks for itself
        }
    }
}
