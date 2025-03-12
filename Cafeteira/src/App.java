
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cafeteira cafeteira = new Cafeteira();
        int opcao;

        do{
            System.out.println("Bem-vindo a Cafeteira Dream 2000");
            System.out.println("Escolha uma opção abaixo; ");

            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Encher café");
            System.out.println("4 - Encher água");
            System.out.println("5 - Fazer café");
            System.out.println("6 - Ver status");
            System.out.println("0 - Encerrar");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cafeteira.ligar();
                    System.out.println("Cafeteira ligada!");
                    System.out.println();
                break;

                case 2:
                    cafeteira.desligar();
                    System.out.println("Cafeteira desligada!");
                    System.out.println();
                break;

                case 3:
                    System.out.println("Quantidade de café a adicionar em gramas: ");
                    int cafe = sc.nextInt();
                    cafeteira.encherCafe(cafe);
                    System.out.println(cafe + "g de café adicionados!");
                    System.out.println();
                break;

                case 4:
                    System.out.println("Quantidade de água a adicionar em ml: ");
                    int agua = sc.nextInt();
                    cafeteira.encherAgua(agua);
                    System.out.println(agua + "ml de água adicionados!");
                    System.out.println();   
                break;

                case 5:
                    if (cafeteira.fazerCafe()) {
                        System.out.println("Xícara de café pronta!");
                        System.out.println();   
                    } else {
                        System.out.println("Falha ao fazer café. Verifique:");
                        System.out.println("- Cafeteira está ligada?");
                        System.out.println("- Tem café suficiente (mínimo 7g)?");
                        System.out.println("- Tem água suficiente (mínimo 30ml)?");
                        System.out.println();
                    }
                break;

                case 6:
                    cafeteira.status();
                    System.out.println();
                break;

                case 0:
                    System.out.println("Encerrando programa...");
                break;
            
                default:
                    System.out.println("Opção inválida");
                    System.out.println();
                break;
            }
        }while(opcao != 0);

        sc.close();
    }
}
