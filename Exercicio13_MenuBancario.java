import java.util.Scanner;

public class Exercicio13_MenuBancario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");

        System.out.println("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é R$ 1000.00");
                break;

            case 2:
                System.out.println("Opção de déposito selecionada");
                break;

            case 3:
                System.out.println("Opção de saque selecionada");
                break;

            case 4:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
    }
}