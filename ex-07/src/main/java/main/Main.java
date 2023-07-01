package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        double novoPesoEngordar = peso + (peso * 0.15);
        System.out.println("Novo peso se engordar 15%: " + novoPesoEngordar);

        double novoPesoEmagrecer = peso - (peso * 0.20);
        System.out.println("Novo peso se emagrecer 20%: " + novoPesoEmagrecer);

        scanner.close();
    }
}
