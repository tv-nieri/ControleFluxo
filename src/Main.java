import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média aritmética é: " + media);

        if (media >= 7)
            System.out.println("Aprovado.");
        else if (media >= 5)
            System.out.println("Recuperação.");
        else
            System.out.println("Reprovado.");
    }
}
