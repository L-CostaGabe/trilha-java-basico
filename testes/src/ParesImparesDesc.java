import java.util.Scanner;

public class ParesImparesDesc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiro = scanner.nextInt();

        System.out.println("Digite o segundo número (maior que o primeiro):");
        int segundo = scanner.nextInt();

        if (segundo <= primeiro) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            return;
        }

        System.out.println("Você quer ver números pares ou ímpares? (Digite 'par' ou 'impar'):");
        String escolha = scanner.next().toLowerCase();

        System.out.println("\nNúmeros " + escolha + " entre " + primeiro + " e " + segundo + " (ordem decrescente):");

        for (int i = segundo; i >= primeiro; i--) {
            var par = i % 2 == 0;
            if (escolha.equalsIgnoreCase("par") && par) {
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("impar") && !par) {
                System.out.println(i);
            }
        }

    }

    {

    }
}
