import java.util.Scanner;

public class inicialNum {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número inicial:");
        var inicial = scanner.nextInt();

        while (true) {
            System.out.println("Digite um número:");
            var num = scanner.nextInt();

            if (num < inicial) {
                System.out.println("Número menor que o inicial. Ignorado");
                continue;
                                
            }
        
            if (num % inicial == 0) {
                System.out.printf("O número é %s divisível por %s. Fim da execução!", num, inicial);
                break;
            }else{
            System.out.printf("O número %s não é divisível por %s. Continue tentando! \n", num, inicial);
            }
        }
    }
}
