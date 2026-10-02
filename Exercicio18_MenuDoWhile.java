import java.util.Scanner;

public class Exercicio18_MenuDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1 - Dizer Olá!");
            System.out.println("2 - Mostrar o número 10");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1 :
                    System.out.println("Olá!");
                    break;

                case 2 :
                    System.out.println(10);
                    break;

                case 3 :
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
