import java.util.Scanner;
public class division {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int numerator = inp.nextInt();
        System.out.println("Enter the denominator:");
        int denominator = inp.nextInt();
        inp.close();
        try {
            divideNumbers(numerator,denominator);
        } catch(ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed:");
        }
    }
    public static void divideNumbers(int numerator,int denominator)
    {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        int result =numerator/denominator;
        System.out.println("Result of division: " + result);
    }
    
}
