import java.util.Scanner;

public class Exercicio10_ControleAcesso{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Possui autorização? ");
        boolean autorizacao = scanner.nextBoolean();

        if (nome.equals("Felipe") && idade >=18 && autorizacao){
            System.out.println("Acesso premitido");
        } else{
            System.out.println("Acesso negado");
        }
        scanner.close();
    }
}