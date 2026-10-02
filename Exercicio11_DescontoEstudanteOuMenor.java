import java.util.Scanner;

public class Exercicio11_DescontoEstudanteOuMenor{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade:");
        int idade = scanner.nextInt();

        System.out.print("É estudante ? ");
        boolean estudante = scanner.nextBoolean();

        if (idade < 18 || estudante){
            System.out.println("Tem direito ao desconto.");
        } else {
            System.out.println("Não tem direito ao desconto");
        }
        scanner.close();
    }
}