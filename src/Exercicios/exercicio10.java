package Exercicios;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scan.nextDouble();

        double conversao = 1.8*celsius+32;

        System.out.println("A temperatura em graus Farenheit é : "+conversao);
    }
}
