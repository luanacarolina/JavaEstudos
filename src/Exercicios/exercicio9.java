package Exercicios;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Farenheit : ");

        double Farenheit = scan.nextDouble();

        double conversao = (5*(Farenheit-32)/9);

        System.out.println("A temperatura em graus Celsius é : "+conversao);
    }
}
