package Exercicios;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto voce ganha por hora ? ");
        double valorhora = scan.nextDouble();

        System.out.println("Qual o numero de horas trabalhadas no mês ? ");
        double horames = scan.nextDouble();

        double salariobruto=valorhora*horames;
        double inss = (salariobruto / 100) *8;
        double ir = (salariobruto / 100) * 11;
        double sindicato = (salariobruto / 100) *5;
        double salarioliquido = salariobruto -(inss+ir+sindicato);

        System.out.println("O salario Bruto é : "+salariobruto);
        System.out.println("O desconto do INSS foi :" +inss);
        System.out.println("O desconto do IR foi : "+ir);
        System.out.println("O desconto do sindicato foi : "+sindicato);
        System.out.println("Seu salario liquido foi : "+salarioliquido);
    }
}
