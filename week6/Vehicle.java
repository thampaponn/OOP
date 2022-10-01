/*
 * tuntun
 */

package week6;
/**
 *
 * @author tunkuki
 */
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    public Vehicle(){
        fuel = 0.0;
    }
    public Vehicle(double fuel){
        this.fuel = fuel;
    }
    public void addFuel(double fuel){
        if (this.fuel > 0){
            this.fuel += fuel;
        }else {
            System.out.println("Fuel is empty.");
        }
        
    }
    public void setFuel(double fuel){
        this.fuel += fuel;
    }
    public double getFuel(){
        return fuel;
    }
    public abstract void honk();
}
