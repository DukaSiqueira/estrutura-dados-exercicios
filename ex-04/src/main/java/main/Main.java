package main;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        System.out.print("Sequência Fibonacci até o próximo número após " + numero + ": ");
        int i = 0;
        while (fibonacci(i) <= numero) {
            System.out.print(fibonacci(i) + " ");
            i++;
        }

        if (fibonacci(i) > numero) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
