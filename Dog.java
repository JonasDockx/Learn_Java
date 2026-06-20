public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String bark() {
        return name + " says woof";
    }

    String describe() {
        return name + ", age " + age;
    }

    public static void main(String[] args) {
        Dog a = new Dog("Rex", 3);
        Dog b = a;      // same object
        b.age = 4;
        System.out.println(a.name + " is " + a.age);    // age is 4 - why?
        System.out.println(a.bark());
        System.out.println(a.describe());

        Dog c = new Dog("Rex", 4);  // Different object, same content
        System.out.println("a == b? " + (a == b));  // true (same arrow)
        System.out.println("a == c? " + (a == c));  // false (different objects) 
    }
}
