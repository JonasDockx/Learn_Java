import java.util.ArrayList;

public class ListIntro {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ann");
        names.add("Bob");
        names.add("Cy");        // grows freely - no fixed size
        names.remove("Bob");    // shrinks too
        names.add("Jonas");
        names.add("Lies");
        names.remove("Bob");

        System.out.println("count:" + names.size());    // 2

        for (String name : names) {
            System.out.println(name);
        }
    }
}
