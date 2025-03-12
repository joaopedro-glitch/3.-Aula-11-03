import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.println("Entre com a base do triângulo: ");
        triangulo.base = sc.nextFloat();

        System.out.println("Entre com a altura do triângulo: ");
        triangulo.altura = sc.nextFloat();

        System.out.println();
        System.out.println(triangulo);

        sc.close();
    }
}
