/*
 * tuntun
 */
package lastmid;

/**
 *
 * @author tunkuki
 */
public class Owner {

    protected final String name;
    protected Animal animal;

    public Owner() {
        this.name = "";
        this.animal = null;
    }

    public Owner(String name) {
        this.name = name;
        this.animal = null;
    }

    public Owner(Animal animal) {
        this.animal = animal;
        this.name = "";
    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void feedFood(Food f) {
        animal.setPower(f.getPower());
    }

    public String toString() {
        return "Owner : name = " + this.name + ", Animal: name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }

    public void protectOwnerFrom(Animal a) {
        if (animal instanceof Dog) {
            ((Dog) animal).kick(a);
        } else if (animal instanceof Pigeous) {
            ((Pigeous) animal).wingAttack(a);
        }
    }
}
