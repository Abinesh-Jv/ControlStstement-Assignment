public class Primes {

    public static void main(String[] args) {
        for (int i = 2; i <= 30; i++) {
            boolean prime = true;
            if (i < 2) {
                prime = false;
            }
            else{
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prime = false;
                    }
                }
            }

            if (prime) {
                System.out.print(i + " ");
            }
        }
    }

}
