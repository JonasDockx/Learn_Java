public class Grades {
    public static void main(String[] args) {
        String name = "Jonas";
        int[] scores = {95, 72, 58, 88};
        if (name.equals("Jonas")) {
            System.out.println("Hello, " + name);
        }
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                System.out.println(scores[i] + ": A");
            } else if (scores[i] >= 60) {
                System.out.println(scores[i] + ": pass");
            } else {
                System.out.println(scores[i] + ": fail");
            }
        }
    }
}
