public class Dog {
    private String name;        // private = unreachable from outside the class
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        setAge(age);            // reuse the validation even at construction
    }

    public String getName() {   // getter: controlled read access
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {   // setter: controlled write access
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negative");
        }
        this.age = age;             // only reached if the value is valid
    }
}
