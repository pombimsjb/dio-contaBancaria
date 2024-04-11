import java.util.Scanner;

public class ContaTerminalJava {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seus dados para criar sua conta.");
        System.out.println();
        System.out.println("Digite o número da sua conta");
        int numeroConta = leitor.nextInt();

        System.out.println("Digite a agência:");
        String agencia = leitor.next();

        System.out.println("Digite seu nome:");
        String nome = leitor.next();

        System.out.println("Digite seu saldo inicial:");
        double saldo = leitor.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é " +
                "%s, conta %s e seu saldo %.2f já está disponível para saque.", nome, agencia, numeroConta, saldo);
    }
}