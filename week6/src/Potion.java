/*
 * tuntun
 */
package week6;

/**
 *
 * @author tunkuki
 */
public class Potion extends Item{
    public void use(Player P){
        P.setHP(10.0);
    }
}
