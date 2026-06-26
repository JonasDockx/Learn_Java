public class TryCatchIntro {
    public static void main(String[] args) {
        int[] ages = {25, -3, 40, -99};

        for (int age : ages) {
            try {
                checkAge(age);
                System.out.println(age + " is valid");
            } catch (IllegalArgumentException e) {
                System.out.println("Skipped: " + e.getMessage());
            }
        }
        System.out.println("Program finished normally.");
    }

    static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negative: " + age);
        }
    }
}
