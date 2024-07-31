package desafios;

/*
Descri��o
Voc� est� desenvolvendo um programa simples em Java para verificar se um cliente � eleg�vel para criar uma conta banc�ria. A condi��o � que o cliente deve ter pelo menos 18 anos de idade.

Entrada
O programa solicitar� ao usu�rio que digite sua idade.
Sa�da
Utilizando apenas um bloco if e else, o programa verificar� se a idade do cliente � igual ou superior a 18 anos.
Se a idade for maior ou igual a 18, o programa informar� que o cliente � eleg�vel para criar uma conta banc�ria.
Se a idade for menor que 18, o programa informar� que o cliente n�o � eleg�vel para criar uma conta banc�ria.
*/


import java.util.Scanner;

public class VerificacaoElegibilidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usu�rio que digite a idade
        int idade = scanner.nextInt();

        // Verifica a elegibilidade com if e else
        if (idade >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        scanner.close();
    }
}