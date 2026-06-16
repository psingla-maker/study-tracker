import java.util.Scanner;

public class StudyTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Hours studied on day " + i + ": ");
            int hours = input.nextInt();
            total += hours;
        }

        System.out.println("Total hours studied this week: " + total);
    }
}
