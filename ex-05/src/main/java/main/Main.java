package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de Opções");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Saída");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarAdicao(scanner);
                    break;
                case 2:
                    realizarSubtracao(scanner);
                    break;
                case 3:
                    realizarMultiplicacao(scanner);
                    break;
                case 4:
                    realizarDivisao(scanner);
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 5);

        scanner.close();
    }

    public static void realizarAdicao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("Resultado da adição: " + resultado);
    }

    public static void realizarSubtracao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("Resultado da subtração: " + resultado);
    }

    public static void realizarMultiplicacao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("Resultado da multiplicação: " + resultado);
    }

    public static void realizarDivisao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        } else {
            System.out.println("Erro: Divisão por zero!");
        }
    }
}
