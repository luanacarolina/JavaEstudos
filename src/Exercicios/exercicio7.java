package Exercicios;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();

      /*  double area = lado*lado;*/
        double calculo = Math.pow(lado, 2);
        System.out.println("O dobro da área é : "+(calculo *2));

    }
}
