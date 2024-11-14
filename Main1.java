import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter day position (0-6) or -1 to exit: ");
            int dayPosition = scanner.nextInt();

            if (dayPosition == -1) {
                break;
            }

            try {
                System.out.println("Day name: " + weekdays[dayPosition]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid day position. Please enter a value between 0 and 6.");
            }
        }

        scanner.close();
    }
}