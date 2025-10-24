import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a coffee you want (use symbolic letter):");
        System.out.println("A - Americano");
        System.out.println("C - Cappuccino");
        System.out.println("L - Latte");
        System.out.println("E - Espresso");

        String tempStr = sc.next(); // kullanıcı girişi al
        char choice = tempStr.charAt(0); // ilk karakteri seç

        switch (choice) {
            case 'A':
            case 'a':
                System.out.println("You ordered an Americano  3 dollars");
                break;

            case 'C':
            case 'c':
                System.out.println("You ordered a Cappuccino 2.50 dollars");
                break;

            case 'L':
            case 'l':
                System.out.println("You ordered a Latte 4.00 dollars");
                break;

            case 'E':
            case 'e':
                System.out.println("You ordered an Espresso 2.50 dollars");
                break;

            default:
                System.out.println("Invalid choice! Please enter A, C, L, or E.");
        }

        sc.close();
    }
}

