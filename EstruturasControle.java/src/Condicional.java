import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();

        if (age >= 18) {
            System.out.printf("%s, você tem %s anos, você pode dirigir.", name, age);
        } else {
            System.out.printf("% você tem %s anos, você nãopode dirigir.", name, age);
        }
        System.out.println("Fim da execução!");
    }
}
