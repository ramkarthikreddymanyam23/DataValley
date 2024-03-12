import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String originalString = input.nextLine();
        System.out.println("Enter the index of the character to replace:");
        int index = input.nextInt(); // Index of the character to replace
        System.out.println("Enter the new character:");
        char newChar = input.next().charAt(0); // New character to replace with
        input.close();
        String modifiedString = replaceCharAtIndex(originalString, index, newChar);
        System.out.println("Modified String: " + modifiedString);
    }
    
    public static String replaceCharAtIndex(String str, int index, char newChar) {
        if (index < 0 || index >= str.length()) {
            throw new IllegalArgumentException("Index is out of range");
        }
        char[] chars = str.toCharArray();
        chars[index] = newChar;
        return new String(chars);
    }
}