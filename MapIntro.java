import java.util.HashMap;

public class MapIntro {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Ann", 30);
        ages.put("Bob", 25);
        ages.put("Ann", 31);
        ages.put("Jonas", 33);
        ages.put("Lies", 33);
        ages.put("Jonas", 34);

        System.out.println("Ann is " + ages.get("Ann"));
        System.out.println("Has Cy? " + ages.containsKey("Cy"));
        System.out.println("count: " + ages.size());
        System.out.println(ages.get("Nobody"));

        for (String name : ages.keySet()) {
            System.out.println(name + " --> " + ages.get(name));
        }
    }
}
