import java.util.Scanner;

public class Exercicio12_EntradaComIngresso{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Idade :");
        int idade = scanner.nextInt();

        System.out.println("Possui ingresso? ");
        boolean ingresso = scanner.nextBoolean();

        System.out.println("Está acompanhado dos pais? ");
        boolean acompanhado = scanner.nextBoolean();

        if ((idade >=18 && ingresso) || (idade < 18 && ingresso && acompanhado)){
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada negada");
        }
        scanner.close();
    }
}