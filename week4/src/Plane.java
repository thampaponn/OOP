/*
 * tuntun
 */
package week4;

/**
 *
 * @author tunkuki
 */
public class Plane extends Vehicle {
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " m/s.");
    }
    public void setPlaneInfo(int s, String t){
        setFuel(s);
        setTopSpeed(t);
    }
    public void fly(){
        if ((getFuel() - 200) >= 0){
            System.out.println("Fly.");
            setFuel(-200);
        }
        else{
            System.out.println("Please add fuel.");
        }
    }
}
