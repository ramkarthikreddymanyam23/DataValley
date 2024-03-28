import java.util.Scanner;
public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = inp.nextInt();
            sum += number;
            count++;
            if (number > big) {
                big = number;
            }
            if (number < small) {
                small = number;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = inp.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + big);
            System.out.println("Smallest number entered: " + small);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }   
        inp.close();
    }
}