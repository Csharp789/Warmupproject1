public class MultiplesOf3And5 {
    public static void main(String[] args) {
        int thelimit = 1000;
        int totalsum = 0;

        for (int i = 0; i < thelimit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                totalsum += i;
            }
        }

        System.out.println("The sum is " + totalsum);
    }
}
