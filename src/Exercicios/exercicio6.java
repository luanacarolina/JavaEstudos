package Exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio : ");

        double raio = scan.nextDouble();

        /*double circulo =raio*raio;*/
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo é :"+area);

    }
}
