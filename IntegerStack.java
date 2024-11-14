import java.util.Stack;
import java.util.Scanner;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack() {
        this.stack = new Stack<>();
    }

    public void push(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check if empty");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter integer: ");
                    integerStack.push(scanner.nextInt());
                    break;
                case 2:
                    integerStack.pop();
                    break;
                case 3:
                    System.out.println("Is empty: " + integerStack.isEmpty());
                    break;
                case 4:
                    integerStack.display();
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