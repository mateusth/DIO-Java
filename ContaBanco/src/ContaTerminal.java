import java.util.Scanner;

public class ContaTerminal {
    public static void main(String args[]) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digite o numero da conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor digite o nome da agencia: ");
        agencia = scanner.next();

        System.out.print("Por favor digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.print("Por favor digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Ola %s. Obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d, e seu saldo R$%.2f ja esta disponivel para saque.", nomeCliente, agencia, numero, saldo);
    }
}