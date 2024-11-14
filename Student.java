public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (!isValidName(name)) {
            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }
        if (!isValidAge(age)) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    private boolean isValidAge(int age) {
        return age >= 15 && age <= 21;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}