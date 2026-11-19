public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");

        for (int i = 2; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == nilCheck(n, i)) { // standard modulo check
                // Simplified: n % i == 0
            }
        }
        // Proper loop:
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}