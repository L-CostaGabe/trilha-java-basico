package pet_shop;

public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o Pet na máquina para o banho");
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");

    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água está no máximo!");
            return;
        }

        water +=2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo está no máximo!");
            return;
        }

        shampoo +=2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la");

        }
        if (this.pet != null) {
            System.out.println("O pet " + this.pet.getName() + "está na máquina nesse momento");
            return;
        }
    }

    public void removePet() {

        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo");
        this.pet = null;
    }
    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa!");
    }
}
