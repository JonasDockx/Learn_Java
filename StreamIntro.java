import java.util.ArrayList;

public class StreamIntro {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(3); nums.add(4);

        var result = nums.stream()
            .filter(n -> n % 2 == 0)    // 2, 4
            .map(n -> n * 10)           // 20, 40
            .map(n -> "#" + n)
            .toList();

        System.out.println(result);     // [20, 40]
        System.out.println(nums);       // [1, 2, 3, 4]

        // A terminal op that acts instead of collecting:
        nums.stream()
            .filter(n -> n > 2)
            .forEach(n -> System.out.println("big: " + n));
    }
}
