import java.util.Scanner;

public class Exercicio09_ValidacaoLogin{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua senha: ");
        int senha = scanner.nextInt();

        if (nome.equals("Felipe") && senha == 1234 ){
            System.out.println ("Login realizado com sucesso.");
    }   else{
            System.out.println ("Usuário ou senha incorreto.");
        }
        scanner.close();
    }
}