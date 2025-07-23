import java.util.Scanner;

public class Operators_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 12, y = 4;

        System.out.println("Select operation:");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Modulo\n6. Logical AND\n7. Logical OR");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition = " + (x + y));
                break;
            case 2:
                System.out.println("Subtraction = " + (x - y));
                break;
            case 3:
                System.out.println("Multiplication = " + (x * y));
                break;
            case 4:
                System.out.println("Division = " + (x / y));
                break;
            case 5:
                System.out.println("Modulo = " + (x % y));
                break;
            case 6:
                System.out.println("Logical AND: " + ((x > 0) && (y > 0)));
                break;
            case 7:
                System.out.println("Logical OR: " + ((x > 0) || (y < 0)));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
