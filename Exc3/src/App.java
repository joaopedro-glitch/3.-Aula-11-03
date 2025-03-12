import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria;

        System.out.println("Entre com o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Entre com o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        System.out.println("Deseja fazer um depósito inicial? (s/n)");
        char escolhaInicial = sc.next().charAt(0);

        if (escolhaInicial == 's' || escolhaInicial == 'S') {
            System.out.println("Entre com o depósito inicial: ");
            double despositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(titular, numero, despositoInicial);    
        }
        else{
            contaBancaria = new ContaBancaria(titular, numero);
        }

        System.out.println();
        System.out.println("Dados da conta: \n" + contaBancaria);

        System.out.println("Entre com um valor para depósito em R$");
        double deposito = sc.nextDouble();
        contaBancaria.deposito(deposito);

        System.out.println();
        System.out.println("Dados atualizados: \n" + contaBancaria);

        System.out.println("Entre com um valor para saque em R$");
        double saque = sc.nextDouble();
        contaBancaria.saque(saque);

        System.out.println();
        System.out.println("Dados atualizados: \n" + contaBancaria);

        sc.close();
    }
}
