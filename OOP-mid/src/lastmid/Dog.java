/*
 * tuntun
 */
package lastmid;

/**
 *
 * @author tunkuki
 */
public class Dog extends Animal {

    public Dog(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setPower(200);
    }

    public void eat(Food f) {
        this.setPower(f.getPower());
    }

    public void kick(Animal a) {
        a.setPower(-10);
    }
}
