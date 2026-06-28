import java.util.HashMap;

public class Gradebook {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Jonas", 90);
        grades.put("Lies", 99);
        grades.put("Mien", 65);
        grades.put("Jos", 50);
        grades.put("Gianluigi", 30);
        grades.put("Daniele", -100);

        var count = grades.values()
            .stream()
            .filter(s -> s >= 60)
            .count();

        System.out.println(count);

        var passers = grades.keySet()
            .stream()
            .filter(name -> grades.get(name) >= 60)
            .toList();

        System.out.println(passers);

        try {
            addGrade(grades, "Sophia", 85);
            addGrade(grades, "Bad", 120);
            System.out.println("(this line is skipped after the throw)");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        System.out.println("Still running. Size: " + grades.size());
    }

    static void addGrade(HashMap<String, Integer> m, String name, int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(name + ": Score cannot be below 0 or above 100.");
        }
        m.put(name, score);
    }
}
