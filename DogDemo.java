public class DogDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Rex", 3);  // a different class using Dog

        d.setAge(-100);     // compiles - setAge is public
    }
}
