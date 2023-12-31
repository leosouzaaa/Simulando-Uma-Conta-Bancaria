import java.util.Scanner;
     /**
     * @author Leo Souza
       @since 09/09/2023
       @version 0.1
     */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa: Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Programa: Por favor, digite o número da Conta:");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Programa: Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Programa: Por favor, digite o Saldo:");
        double saldo = Double.parseDouble(scanner.nextLine());

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

