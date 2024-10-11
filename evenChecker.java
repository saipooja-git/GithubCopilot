public class EvenChecker {
    public static void main(String[] args) {
        int number = 2468; // Example number
        boolean allEven = checkEvenDigits(number);
        
        if (allEven) {
            System.out.println("All digits are even.");
        } else {
            System.out.println("Not all digits are even.");
        }
    }

    public static boolean checkEvenDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}