import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Conta!");
        int accountNumber = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agency = scanner.next();

        System.out.println("Por favor, digite o nome!");
        String customerName = scanner.next();

        System.out.println("Por favor, digite o Saldo!");
        double accountBalance = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + customerName + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agency + ", conta " + accountNumber + " e seu saldo " + accountBalance + " já está disponível para saque. ");


    }
}