public class LambdaIntro {
    public static void main(String[] args) {
        Greeter g = name -> "Hi " + name;
        System.out.println(g.greet("Jonas"));
        Greeter h = name -> "Hello, " + name + "!";
        System.out.println(h.greet("Jonas"));

        Adder c = (a, b) -> a + b;
        System.out.println(c.add(2, 3));
    }
}

interface Greeter {String greet(String name); }

interface Adder { int add(int a, int b); }
