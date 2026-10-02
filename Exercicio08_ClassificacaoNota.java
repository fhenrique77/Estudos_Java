import java.util.Scanner;

public class Exercicio08_ClassificacaoNota{
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        int nota = scanner.nextInt();

        if (nota >=7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 ){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}