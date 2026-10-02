import java.util.Scanner;

public class Exercicio15_MenuBancarioRepeticao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.00;
        double valor;

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: R$" + saldo);
                    break;

                case 2:
                    System.out.println("Valor do depósito: ");
                    valor = scanner.nextDouble();
                    if (valor < 0 || valor == 0) {
                        System.out.println("Valor inválido");
                        break;
                    } else {
                        saldo += valor;
                        System.out.println("Novo saldo: R$" + saldo);
                        break;
                    }
                case 3:
                    System.out.println("Valor do saque: ");
                    valor = scanner.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente");
                        break;
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo: R$");
                        break;
                    }
                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }
        scanner.close();
    }
}


