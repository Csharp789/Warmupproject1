public class MultiplesOf3And5 {
    public static void main(String[] args) {
        int limit = 1000;
        int totalsum = 0;

        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                totalsum += i;
            }
        }

        System.out.println("The sum is " + totalsum);
    }
}
