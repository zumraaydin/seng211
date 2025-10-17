import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı gir: ");
        int number = sc.nextInt();

        // Metodu çağır
        if (isPrime(number)) {
            System.out.println(number + " asaldır ");
        } else {
            System.out.println(number + " asal değildir ");
        }

        sc.close();
    }

    // Asal kontrol metodu
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        // 3'ten başlayarak kök(n)'e kadar kontrol et
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
