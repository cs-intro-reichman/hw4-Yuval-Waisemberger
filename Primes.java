public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] primeArr = new boolean[N+1];
        primeArr[0] = false;
        primeArr[1] = false;
        // Initiallizing primeArray according to the algorithm/
        for (int i = 2; i < primeArr.length; i++) {
            primeArr[i] = true;
        }
        // Crossing out all multiples of p primes till the root of N
        int p = 2;
        while (p <= Math.sqrt(N)) {
            if (primeArr[p]) {
                for (int j = p*p; j < primeArr.length; j = j + p) {
                    primeArr[j] = false;
                }
            }
            p++;
        }

        System.out.println("Prime numbers up to " + N + ":");
        int countPrime = 0;
        for (int i = 2; i < primeArr.length; i++) {
            if (primeArr[i]) {
                System.out.println(i);
                countPrime++;
            }
        }
        // Didn't know if % is soppused to be an int or double. Chose the safest case.
        double percent = (countPrime / (double)N) * 100;
        System.out.println("There are " + countPrime + " primes between 2 and " + N + " (" + percent +"% are primes)");
    }
}