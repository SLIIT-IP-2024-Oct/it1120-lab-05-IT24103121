import java.util.Scanner;

public class IT24103121Lab5Q2 {
    public static void main(String[] args) {
        Scanner mem = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = mem.nextInt();      
        if (newMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {   
               switch (newMembers) {
                case 0 -> System.out.println("Prize is: No Prize");
                case 1 -> System.out.println("Prize is: Pen");
                case 2 -> System.out.println("Prize is: Umbrella");
                case 3 -> System.out.println("Prize is: Bag");
                case 4 -> System.out.println("Prize is: Travelling Chair");
                default -> System.out.println("Prize is: Headphone");
            }
        }

        mem.close();
    }
}