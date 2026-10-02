import java.util.Scanner;

public class Exercicio06_CadastroComScanner{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine(); // limpa o Enter que ficou pendente

        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite seu semestre: ");
        int semestre = scanner.nextInt();

        System.out.println ("Olá, " + nome + " !");
        System.out.println ("Você tem " + idade + " anos");
        System.out.println ("Curso " + curso);
        System.out.println ("Estou no " + semestre + "º semestre");
        scanner.close();
    }
}