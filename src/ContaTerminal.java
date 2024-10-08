import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.of("BR"));

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta:");
        numero = sc.nextInt();

        System.out.println("Agora digite o numero da agência:");
        agencia = sc.next();

        System.out.println("Digite o seu nome:");
        nomeCliente = sc.next();

        System.out.println("Por ultimo, digite o saldo de sua conta:");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$:%.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
