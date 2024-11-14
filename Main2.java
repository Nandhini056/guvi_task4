public class Main2 {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "John Doe", 5);
            System.out.println("Voter Information:");
            System.out.println("Voter ID: " + voter1.getVoterId());
            System.out.println("Name: " + voter1.getName());
            System.out.println("Age: " + voter1.getAge());

            Voter voter2 = new Voter(2, "Jane Doe", 17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}