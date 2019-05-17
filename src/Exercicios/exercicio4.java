package Exercicios;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre : ");
        double bim1 = scan.nextDouble();

        System.out.println("Digite a nota do segundo bimestre : ");
        double bim2 = scan.nextDouble();

        System.out.println("Digite a nota do terceiro bimestre :");
        double bim3 = scan.nextDouble();

        System.out.println("Digite a nota do quarto bimestre : ");
        double bim4 = scan.nextDouble();

        double media = (bim1+bim2+bim3+bim4)/4;
        System.out.println("A média é : "+media );
    }
}
