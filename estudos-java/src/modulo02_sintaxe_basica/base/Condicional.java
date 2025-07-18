package base;
import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        var CanDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = CanDrive ? 
                name + ", você pode dirigir. " : 
                name + ", você não pode dirigir. ";

        System.out.println(message);        
        System.out.println("Fim da execução!");
    }
}
