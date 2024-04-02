import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer number:");
        int number = sc.nextInt();

        boolean divisibleBy4 = number % 4 == 0;
        boolean divisibleBy6 = number % 6 == 0;
        boolean divisibleBy10 = number % 10 == 0;

        if (divisibleBy4 || divisibleBy6 || divisibleBy10) {
            System.out.print(number + " is divisible by ");
            if (divisibleBy4)
                System.out.print("4");
            if (divisibleBy6) {
                if (divisibleBy4)
                    System.out.print(", ");
                System.out.print("6");
            }
            if (divisibleBy10) {
                if (divisibleBy4 || divisibleBy6)
                    System.out.print(", ");
                System.out.print("10");
            }
            System.out.println();
        } else {
            System.out.println(number + " is not divisible by 4, 6, or 10");
        }
    }
}