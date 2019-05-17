package Aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        /* System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é :" +nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scan.next();
        System.out.println("Seu primeiro nome é : "+nome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é : "+idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " + altura);*/

        System.out.println("Digite o seu primeiro nome , idade , quantidade de filhos , altura e se tem bichinhos de estimação ?");

        String nome = scan.next();
        int idade = scan.nextInt();
        byte qtdfilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean tempets = scan.nextBoolean();

        System.out.println("Digite seu primeiro nome : "+nome);
        System.out.println("Digite sua idade: "+idade);
        System.out.println("Quantidade de filhos : "+qtdfilhos);
        System.out.println("Digite sua altura :"+altura);
        System.out.println("Tem bichinhos de estimação ? "+tempets);
    }
}
