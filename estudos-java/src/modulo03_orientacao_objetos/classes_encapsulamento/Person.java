// Pacote onde está essa classe (organização do projeto)
package modulo03_orientacao_objetos.classes_encapsulamento;

// Importa a classe OffsetDateTime para pegar o ano atual
import java.time.OffsetDateTime;

//  Classe "molde" chamada Person (Pessoa)
public class Person {

    // Atributo privado: nome da pessoa (final = não pode mudar depois de criado)
    private final String name;

    // Atributo privado: idade da pessoa
    private int age;

    // Atributo privado: guarda o ano da última vez que a idade foi aumentada
    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    // Construtor: chamado quando criamos uma nova pessoa
    public Person(String name) {
        this.name = name; // ⚠️ "this.name" é o atributo da classe / "name" é o parâmetro
        this.age = 1; // idade começa em 1 por padrão
    }

    // Método público: permite ver o nome da pessoa
    public String getName() {
        return this.name;
    }

    // Método público: permite ver a idade atual da pessoa
    public int getAge() {
        return this.age;
    }

    // Método público: aumenta a idade da pessoa, mas só 1x por ano
    public void incAge() {
        // Se já aumentou este ano, não faz nada
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear())
            return;

        this.age += 1;

        // Atualiza o ano em que a idade foi aumentada
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
