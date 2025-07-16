package modulo03_orientacao_objetos.heranca_e_polimorfismo;

public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        System.out.printf("==============\n");
        switch (employee) {
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("John");
                manager.setSalary(5000.00);
                manager.setLogin("john.manager");
                manager.setPassword("123");
                manager.setCommission(10.0);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());

            }
            case Salesman salesman -> {
                salesman.setCode("456");
                salesman.setName("Jane");
                salesman.setSalary(2000);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }

        }
       
        System.out.println(employee.getFullSalary());
        System.out.println("=============");

    }

}