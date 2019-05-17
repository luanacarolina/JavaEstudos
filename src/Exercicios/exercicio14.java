package Exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo : ");
        double tamanhoarquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet : ");
        double velocidadeinternet = scan.nextDouble();

        double tempo = tamanhoarquivo / velocidadeinternet;

        System.out.println("Tempo de download :"+tempo);
    }
}
