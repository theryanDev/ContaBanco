import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu noome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque ");
    }
}