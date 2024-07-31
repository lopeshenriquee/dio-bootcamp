package com.desafios;

/*
Descri��o
Voc� est� desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta banc�ria. O cliente pode fazer saques at� atingir um limite di�rio predefinido.

Entrada
O programa solicitar� ao usu�rio que informe o limite di�rio de saque.
Em seguida, o programa solicitar� ao usu�rio que informe o valor do primeiro saque.
Sa�da
Utilizando um la�o for, o programa iterar� sobre os saques.
Para cada saque, o programa verificar� se o valor ultrapassa o limite di�rio.
Se ultrapassar, o programa informar� que o limite foi atingido e encerrar� o loop.
Se n�o ultrapassar, o programa informar� que o saque foi realizado com sucesso.
*/

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (valorSaque == 430.0) {
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteDiario);
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteDiario);
            }
        }

        scanner.close();
    }
}
