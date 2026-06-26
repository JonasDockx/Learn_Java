public class BoxIntro {
    public static void main(String[] args) {
        class Box<T> {
            private T item;
            public void put(T item) { this.item = item; }
            public T get() { return item; }
        }

        Box<String> s = new Box<>();
        s.put("hello");
        String text = s.get();
        System.out.println(text);

        Box<Integer> n = new Box<>();
        n.put(42);
        int number = n.get();
        System.out.println(number);
    }
}
