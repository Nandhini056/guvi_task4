public class Main {
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "John Doe", 20, "B.Tech");
            System.out.println("Student Information:");
            System.out.println("Roll No: " + student.getRollNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}