/*
 * tuntun
 */
package lastmid;

/**
 *
 * @author tunkuki
 */
public abstract class Bird extends Animal implements Flyable {

    public Bird(String name, int age) {
        super.setName(name);
        super.setAge(age);
        super.setPower(150);
    }

    public abstract void wingAttack(Animal a);
}
