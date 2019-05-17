package Exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor por hora : ");
        double valorhora = scan.nextDouble();

        System.out.println("Digite as horas trabalhadas no mês: ");
        double horames = scan.nextDouble();

        double salario = valorhora*horames;

        System.out.println("O seu salario é : "+salario);
    }
}
