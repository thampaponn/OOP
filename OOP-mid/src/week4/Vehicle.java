/*
 * tuntun
 */
package week4;

/**
 *
 * @author tunkuki
 */
public class Vehicle {
    private int fuel;
    private String topSpeed;
    protected void setFuel(int i){
        fuel = fuel + i;
    }
    protected void setTopSpeed(String n){
        topSpeed = n;
    }
    protected int getFuel(){
        return fuel;
    }
    protected String getTopSpeed(){
        return topSpeed;
    }
    public void showInfo(){
        System.out.println("Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " m/s.");
    }
}
