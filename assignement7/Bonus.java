import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter current year: ");
        int currentYear = inp.nextInt();
        System.out.print("Enter the year of joining: ");
        int yearOfJoining = inp.nextInt();
        int yearsOfService = currentYear - yearOfJoining;
        if (yearsOfService > 5) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, you are not eligible for a bonus at this time.");
        }
        
        inp.close();
    }
}