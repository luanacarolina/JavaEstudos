package Exercicios;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro:");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero inteiro : ");

        int numero2 = scan.nextInt();

        System.out.println("Digite um numero Real : ");
        float numero3 = scan.nextFloat();


        double calculo1 = ((2*numero1)*(numero2/2));

        System.out.println("O produto do dobro do primeiro numero com a metade do segundo numero é : " +calculo1);

        double calculo2 = numero1*3+numero3;

        System.out.println("A soma do triplo do primeiro com o terceiro : "+calculo2);

        double calculo3 = numero3*numero3*numero3;

        System.out.println("O terceiro elevado ao cubo: "+calculo3);


    }
}
