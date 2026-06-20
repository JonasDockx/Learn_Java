public class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String meow() {
        return name + " says meow";
    }

    String describe() {
        return name + ", age " + age;
    }

    public static void main(String[] args) {
        Cat a = new Cat("Rex", 3);
        Cat b = a;      // same object
        b.age = 4;
        System.out.println(a.name + " is " + a.age);    // age is 4 - why?
        System.out.println(a.meow());
        System.out.println(a.describe());

        Cat c = new Cat("Rex", 4);  // Different object, same content
        System.out.println("a == b? " + (a == b));  // true (same arrow)
        System.out.println("a == c? " + (a == c));  // false (different objects) 
    }
}
