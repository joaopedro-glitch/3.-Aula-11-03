
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("Entre com o marca do carro: ");
            String marca = sc.nextLine();

            System.out.println("Entre com o modelo do carro: ");
            String modelo = sc.nextLine();

            Carro carro = new Carro(marca, modelo);
            System.out.println("Marca: " + carro.marca);
            System.out.println("Modelo: " + carro.modelo);

            System.out.println("Deseja inserir um novo modelo? 1 - continuar e 0 - encerrar");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha após o número

            continuar = (opcao == 1);    
        }

        System.out.println("Encerrando...");

        sc.close();
    }
}
