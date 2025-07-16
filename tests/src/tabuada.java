import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Escolha a tabuada: ");
        var num = scanner.nextInt();

        // for (inicialização; condição; atualização)
        for (var i = 1; i <= 10; i++) {

            var result = num * i;
            
            System.out.printf("%s x %s = %s \n", num, i, result);
        }
    }
}
