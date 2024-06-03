import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
   
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();


        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

    System.out.println("Olá " + nome + " " + sobrenome + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponivel para saque.");
    
    
    }
}
