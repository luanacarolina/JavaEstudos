package Exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em metro :");
        double metros = scan.nextDouble();

        double conversao = metros*100;

        System.out.println("A conversão em centimetros é : "+conversao);
    }
}
