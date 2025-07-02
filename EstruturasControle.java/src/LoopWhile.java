import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        /*
         * while (!name.equals("exit")) {
         * System.out.println("Informe seu nome: ");
         * name = scanner.next();
         * 
         * 
         * 
         * }
         * System.out.printf("Correto: %s", name);
         */

        while (true) {
            System.out.println("Informe seu nome: ");
            name = scanner.next();
           

            if(name.equalsIgnoreCase("exit")) break;

        }

         System.out.println(name);
       

    }
}
