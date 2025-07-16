package modulo03_orientacao_objetos.heranca_e_polimorfismo;

public non-sealed class Salesman extends Employee {

    private double percentPerSold;

    private double soldAmount;

    @Override
    public double getFullSalary(){
        return this.salary + ((soldAmount * percentPerSold) / 100);
    }

    @Override
    public String getCode() {
        return "SL" + super.getCode();
    }

    public Salesman(
            String code,
            String name,
            String adress,
            int age,
            double salary,
            double percentPerSold,
            double soldAmount) {
        super(code, name, adress, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;            
    }

    public Salesman() {
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(final double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
    public double getSoldAmount() {
        return soldAmount;
    }
    public void setSoldAmount(final double soldAmount) {
        this.soldAmount = soldAmount;
    }
}
