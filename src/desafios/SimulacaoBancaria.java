package desafios;

/*
Descri��o
Voc� est� desenvolvendo um programa simples em Java para simular opera��es banc�rias b�sicas. A aplica��o deve permitir ao usu�rio realizar dep�sitos, saques e consultar o saldo em uma conta banc�ria virtual.

Entrada
O programa exibir� um menu com as seguintes op��es:

Depositar
Sacar
Consultar Saldo
Encerrar
O usu�rio escolher� uma dessas op��es digitando o n�mero correspondente.

Sa�da
Utilizando um switch, o programa realizar� a opera��o escolhida pelo usu�rio.

Se o usu�rio escolher:

1: O programa solicitar� o valor a ser depositado e atualizar� o saldo. Al�m disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
2: O programa solicitar� o valor a ser sacado e verificar� se h� saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
3: O programa apenas exibir� o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
0: O programa encerrar�, imprimindo "Programa encerrado.".
 */

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo+= valorDeposito;
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (saldo < valorSaque){
                      System.out.println("Saldo insuficiente.");
                    } 
                    else {
                      saldo -= valorSaque;
                      System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a vari�vel de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Op��o inv�lida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
