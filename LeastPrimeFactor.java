import java.util.Arrays;

public class LeastPrimeFactor {
    public static void main(String[] args) {
        int N = 20; // Change N to the desired number

        int[] leastPrimeFactors = new int[N + 1];
        Arrays.fill(leastPrimeFactors, -1); // Initialize with -1 indicating prime

        for (int i = 2; i <= N; i++) {
            if (leastPrimeFactors[i] == -1) { // i is prime
                leastPrimeFactors[i] = i; // Least prime factor of a prime number is the number itself

                // Mark multiples of i with i as their least prime factor
                for (int j = i * 2; j <= N; j += i) {
                    if (leastPrimeFactors[j] == -1) {
                        leastPrimeFactors[j] = i;
                    }
                }
            }
        }

        // Print the least prime factors for all numbers from 1 to N
        System.out.println("Least Prime Factors:");
        for (int i = 1; i <= N; i++) {
            System.out.println(i + " : " + leastPrimeFactors[i]);
        }
    }
}
