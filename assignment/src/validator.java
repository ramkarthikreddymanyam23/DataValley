class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}
public class validator {
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be nagative");
        }
    }
    public static void main(String[] args) {
        int inputNumber = -5;
        try {
            validateNumber(inputNumber);
            System.out.println("Number is valid: " + inputNumber);
        } catch (CustomValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}