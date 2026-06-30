import java.util.HashMap;

public class BugHunt {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Ann", 30);

        String name = "Bob";              // not in the map
        if (ages.containsKey(name)) {
            int age = ages.get(name);
            System.out.println(name + " is " + age);
        } else {
            System.out.println(name + " not found.");
        }
    }
}
