import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC ");
        System.out.println("==========================");

        System.out.println("Digite sua altura: ");
        var altura = scanner.nextDouble();
        System.out.println("Digite seu peso: ");
        var peso = scanner.nextDouble();

        
        var imc = peso / (altura*altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
            
        }
        
        else if (imc < 25) {
            System.out.println("Peso ideal");
            
        }
        else if (imc < 30) {
            System.out.println("Levemente acima do peso");
            
        }
        else if (imc < 35) {
            System.out.println("Obesidade Grau I");
                        
        }
        else if (imc < 40) {
            System.out.println("Obesidade grau II (Severa)");
                        
        }
        else {
            System.out.println("Obesidade III (Mórbida)");
            
        }

    }
    
}
