# ☕ Java POO: Conceitos de Classes e Encapsulamento

Este projeto é parte dos meus estudos em Programação Orientada a Objetos com Java, com foco nos conceitos de **classes**, **encapsulamento**, **construtores**, **getters/setters** e o uso da palavra-chave **`this`**.

---

## 📚 Conceitos e Aprendizados

### 1. Classe

- A **classe** é o modelo ou molde que define as características (atributos) e comportamentos (métodos) dos objetos.
- Na prática, uma classe representa um conceito do mundo real, permitindo criar vários objetos com essas mesmas características.

### 2. Atributos e Encapsulamento

- Os **atributos** são as variáveis que guardam o estado de um objeto.
- Usar o modificador `private` nos atributos é fundamental para **proteger os dados**, evitando acessos diretos e não controlados.
- O **encapsulamento** permite controlar o acesso aos dados da classe, permitindo que eles sejam lidos ou modificados apenas por meio de métodos públicos específicos.

### 3. Construtor

- O **construtor** é um método especial usado para inicializar objetos.
- Ele é chamado automaticamente ao criar um novo objeto e pode receber parâmetros para definir valores iniciais dos atributos.
- A palavra-chave `this` é usada dentro do construtor para diferenciar atributos da classe dos parâmetros com o mesmo nome.

### 4. Getters e Setters

- **Getters** são métodos públicos que permitem **ler** o valor dos atributos privados.
- **Setters** são métodos públicos que permitem **modificar** os valores dos atributos, mas sempre respeitando regras de negócio e validações necessárias.
- No caso de atributos imutáveis (como `final`), geralmente só existe o getter, garantindo que o valor não seja alterado após a criação.

### 5. Palavra-chave `this`

- `this` refere-se ao próprio objeto atual da classe.
- É usada para evitar ambiguidades quando o nome de um atributo é igual ao nome de um parâmetro, especialmente em construtores e setters.

### 6. Lógica de Negócio dentro da Classe

- É possível e recomendado implementar **regras de negócio** diretamente dentro dos métodos da classe.
- Exemplo: um método que só permite aumentar a idade de uma pessoa uma vez por ano, garantindo que a regra seja respeitada e o estado do objeto seja consistente.

---

## 🚀 Aplicação prática

Na atividade realizada, os conceitos acima foram aplicados para criar uma classe que:

- Protegeu os dados com atributos privados;
- Usou um construtor para inicializar o objeto com nome e idade inicial;
- Forneceu métodos controlados para acessar (getters) e modificar (incrementar a idade) o estado do objeto;
- Aplicou uma regra para garantir que a idade só seja incrementada uma vez por ano, mostrando como o encapsulamento ajuda a proteger o estado e aplicar lógica.
