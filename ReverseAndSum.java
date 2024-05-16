import java.util.Scanner;
class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        int digitsum = 0;
        
        do {
            int lastDigit = number % 10;

            digitsum += lastDigit;

            reversedNumber = reversedNumber * 10 + lastDigit;

            number = number / 10;
        }while (number > 0);

        System.out.println("Reversed Number:"+ reversedNumber);
        System.out.println("Sum of Digits:"+ digitsum);
    }
}