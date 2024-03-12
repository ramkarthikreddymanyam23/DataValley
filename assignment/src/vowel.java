public class vowel {
    public static void main(String[] args) {
        String inputString = "Welcome to the world of Java!";
        int[] counts = countVowelsAndConsonants(inputString.toLowerCase()); 
        System.out.println("Input String: " + inputString);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
    public static int[] countVowelsAndConsonants(String str) {
        int[] counts = new int[2];
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counts[0]++; 
                } else {
                    counts[1]++; 
                }
            }
        }
        return counts;
    }
}