import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeBook {
    private Map<String, Integer> studentGrades;

    public StudentGradeBook() {
        this.studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added successfully.");
    }


    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }


    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentGrades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }


    public void displayAllGrades() {
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + "'s grade: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentGradeBook gradeBook = new StudentGradeBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display grade");
            System.out.println("4. Display all grades");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    gradeBook.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    gradeBook.removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    gradeBook.displayGrade(name);
                    break;
                case 4:
                    gradeBook.displayAllGrades();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}