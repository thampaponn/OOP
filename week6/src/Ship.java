/*
 * tuntun
 */

package week6;
/**
 *
 * @author tunkuki
 */
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        this.fuel = 0.0;
    }
    public Ship(double fuel){
        this.fuel = fuel;
    }
    public void move(){
        fl0at();
    }
    public void move(int distance){
        for (int i = 0;i < distance; i++){
            if (fuel >= 50){
                fl0at();
            } else{
                System.out.println("Fuel is not enough.");
                break;
            }
        }
    }
    public void fl0at(){
        if (fuel >= 50){
            fuel -= 50;
            System.out.println("Ship moves");
        } else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine(){
        if (fuel >= 10){
            fuel -= 10;
            System.out.println("Engine starts");
        } else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    public void honk(){
        System.out.println("Shhhhh");
    }
}
