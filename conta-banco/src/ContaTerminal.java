import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe scanner
        // Exibir as mensagens para nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta

        var scanner = new Scanner(System.in);

        System.out.println("Numero de usuário:");
        var userNumber = scanner.nextInt();
        scanner.nextLine();
       

        System.out.println("Nome completo: ");
        var name = scanner.nextLine();

        System.out.println("Agência: ");
        var bank = scanner.nextLine();

        System.out.println("Saldo: ");
        var balance = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque", name, bank, userNumber, balance);


    }
}
