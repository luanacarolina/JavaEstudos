package Exercicios;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero :");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scan.nextInt();

        double soma = numero1+numero2;

        System.out.println("A soma dos numeros é :"+soma);
    }
}
