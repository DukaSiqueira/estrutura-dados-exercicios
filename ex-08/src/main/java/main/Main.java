package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa em quilos: ");
        double pesoQuilos = scanner.nextDouble();

        double pesoGramas = pesoQuilos * 1000;
        System.out.println("O peso da pessoa em gramas é: " + pesoGramas);

        scanner.close();
    }

}
