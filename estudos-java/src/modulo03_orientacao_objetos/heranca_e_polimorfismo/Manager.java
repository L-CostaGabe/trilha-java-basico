package modulo03_orientacao_objetos.heranca_e_polimorfismo;

public non-sealed class Manager extends Employee {

    private String login;

    private String password;

    private double commission;

   

    @Override
    public String getCode() {
        return "MN" + super.getCode();
    }

    public Manager(
            String code,
            String name,
            String adress,
            int age,
            double salary,
            String login,
            String password,
            double commission) {
        super(code, name, adress, age, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }

    Manager() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(final double commission) {
        this.commission = commission;
    }
     @Override
    public double getFullSalary() {
        return this.salary + this.commission;
    }

    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }
}
