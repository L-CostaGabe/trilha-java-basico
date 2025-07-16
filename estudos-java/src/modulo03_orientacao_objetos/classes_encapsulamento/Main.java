// Pacote onde a classe principal está
package modulo03_orientacao_objetos.classes_encapsulamento;

//  Classe com método principal (ponto de partida da aplicação)
public class Main {

    // Método main: é onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria uma nova pessoa chamada João (objeto da classe Person)
        var male = new Person("João");

        // Cria outra pessoa chamada Maria
        var female = new Person("Maria");

        // Imprime os dados das pessoas usando os métodos públicos (getters)
        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
    }
}