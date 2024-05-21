import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome da Agência !");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente !");
        String NomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo !");
        Double Saldo = scanner.nextDouble();


        System.out.println("Olá " + NomeCliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +
            ", conta " + Numero + " e seu saldo " + Saldo.toString() +" já está disponível para saque.");
    }

}
