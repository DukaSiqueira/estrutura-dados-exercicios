package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("Você digitou um número entre 100 e 200.");
        } else {
            System.out.println("Você digitou um número fora da faixa entre 100 e 200.");
        }

        scanner.close();
    }
}
