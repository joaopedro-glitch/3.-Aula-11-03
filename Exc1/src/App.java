
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.println("Insira a idade da pessoa: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println();

        Pessoa pessoa = new Pessoa(nome, idade);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        sc.close();
    }
}
