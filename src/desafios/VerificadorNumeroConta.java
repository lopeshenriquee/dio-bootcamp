package desafios;

/*
Descri��o
Voc� est� desenvolvendo um programa simples em Java para verificar se um n�mero de conta banc�ria � v�lido. O n�mero da conta deve ter exatamente 8 d�gitos.

Entrada
O programa solicitar� ao usu�rio que digite o n�mero da conta banc�ria.
Sa�da
O programa utilizar� um bloco try-catch para verificar se o n�mero da conta possui exatamente 8 d�gitos.
Se o n�mero da conta tiver 8 d�gitos, o programa informar� que � um n�mero v�lido.
Se o n�mero da conta n�o tiver 8 d�gitos, o programa lan�ar� uma exce��o (por exemplo, IllegalArgumentException) e informar� que o n�mero da conta � inv�lido.
*/

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);
            
           
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // TODO: Informar que o n�mero de conta � inv�lido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
           
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // TODO: Lan�ar uma IllegalArgumentException com a seguinte mensagem:
            // "Numero de conta invalido. Digite exatamente 8 digitos."
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}