import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc1 = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta! ");
        int numero = sc1.nextInt();

        System.out.println("Digite o número da Agência!");
        String agencia = sc1.next();

        System.out.println("Digite seu Nome! ");
        String nome = sc1.next();

        System.out.println("Digite o seu saldo! ");
        double saldo = sc1.nextDouble();

        System.out.println("Olá " + nome + "!, obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");





    }
}
