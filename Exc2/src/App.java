
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o título do livro: ");
        String titulo = sc.nextLine();

        System.out.println("Digite o nome do autor: ");
        String autor = sc.nextLine();

        System.out.println("Digite o ano de publicação: ");
        int anoPublic = sc.nextInt();
        sc.nextLine();

        Livro livro = new Livro(titulo, autor, anoPublic);

        System.out.println(livro);

        sc.close();
    }
}
