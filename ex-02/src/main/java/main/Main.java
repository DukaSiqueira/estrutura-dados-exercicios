package main;

public class Main {

    public static void main(String[] args) {
        int x = 5;

        int y = calculateSum(x, 100);

        System.out.println("O valor de Y é: " + y);
    }

    public static int calculateSum(int x, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (x + n) + calculateSum(x, n - 1);
        }
    }
}