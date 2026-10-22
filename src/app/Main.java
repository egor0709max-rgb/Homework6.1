package app;

public class Main {
    static void main(String[] args) {

        int sum = 0;

        for (int num = 1; num <= 6; num++) {
            sum += num;
            System.out.printf("%d) Num is %d, sum is %d%n", num, num, sum);

        }
        System.out.println("--------------------------");
        System.out.printf("Sum of numbers is %d%n", sum);
    }
}