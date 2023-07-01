package main;

public class Main {

    public static void main(String[] args) {
        double resultado = calcularS(1, 1);
        System.out.println("O valor de S é: " + resultado);
    }

    public static double calcularS(int numerador, int denominador) {
        if (numerador > 99 || denominador > 50) {
            return 0.0;
        } else {
            double termo = (double) numerador / denominador;
            return termo + calcularS(numerador + 2, denominador + 1);
        }
    }
}
