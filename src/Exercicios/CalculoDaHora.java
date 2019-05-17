package Exercicios;

public class CalculoDaHora {
    public static void main(String[] args) {

        double salario =2550.50;
        double horasSemana = 40;
        double horasMes = horasSemana*4;

        double valorDaHora = salario/horasMes;

        System.out.println("O valor da hora de trabalho de maria é: "+valorDaHora);
    }
}
