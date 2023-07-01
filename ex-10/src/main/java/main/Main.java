package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de moedas de 1 centavo: ");
        int moedas1Centavo = obterQuantidade(scanner);

        System.out.print("Digite a quantidade de moedas de 5 centavos: ");
        int moedas5Centavos = obterQuantidade(scanner);

        System.out.print("Digite a quantidade de moedas de 10 centavos: ");
        int moedas10Centavos = obterQuantidade(scanner);

        System.out.print("Digite a quantidade de moedas de 25 centavos: ");
        int moedas25Centavos = obterQuantidade(scanner);

        System.out.print("Digite a quantidade de moedas de 50 centavos: ");
        int moedas50Centavos = obterQuantidade(scanner);

        System.out.print("Digite a quantidade de moedas de 1 real: ");
        int moedas1Real = obterQuantidade(scanner);

        double valorTotal = (moedas1Centavo * 0.01) + (moedas5Centavos * 0.05) + (moedas10Centavos * 0.10) +
                (moedas25Centavos * 0.25) + (moedas50Centavos * 0.50) + moedas1Real;

        System.out.println("O valor total economizado é: R$" + valorTotal);

        scanner.close();
    }

    private static int obterQuantidade(Scanner scanner) {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(input);
    }
}
