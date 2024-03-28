import java.util.Scanner;
public class Library{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = inp.nextInt();
        if (daysLate >= 1 && daysLate <= 7) {
            System.out.println("Fine: 50 paise");
        } else if (daysLate >= 8 && daysLate <= 14) {
            System.out.println("Fine: 1 rupee");
        } else if (daysLate > 14 && daysLate <= 21) {
            System.out.println("Fine: 5 rupees");
        } else if (daysLate > 21) {
            System.out.println("Membership canceled. Return the book immediately.");
        } else {
            System.out.println("No fine.");
        }
        
        inp.close();
    }
}