import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o nome do dono da conta: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por Favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digtte o saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo + ", já está disponível para saque.");

    }
}
