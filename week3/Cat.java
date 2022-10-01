/*
 * tuntun
 */
package week3;

/**
 *
 * @author tunkuki
 */
public class Cat {
    private String name;
    private String color;
    public double height;
    public double weight;
    public static void main(String[] args) {
        Cat c = new Cat();
        c.defineCat("Mew", "White");
        c.speak();
        
        c.upWeight(5);
        c.upHeight(10);
        c.speak();
        
        c.upWeight(-5);
        c.upHeight(-10);
        c.speak();
    }
    private void setWeight(double w){
        if(w <= 0){
            System.out.println("Error");
        }else{
            weight = w;
        }
    }
    private void setHeight(double h){
        if(h <= 0){
            System.out.println("Error");
        }else{
            height = h;
        }
    }
    private void setName(String n){
        name = n;
    }
    private void setColor(String c){
        color = c;
    }
    public void upWeight(double w){
        if(w <= 0){
            System.out.println("Error");
        }
        else{
            weight += w;
            setWeight(weight);
        }
    }
    public void downWeight(double w){
        if(w <= 0){
            System.out.println("Error");
        }
        else{
            weight -= w;
            setWeight(weight);
        }
    }
    public void upHeight(double h){
        if(h <= 0){
            System.out.println("Error");
        }
        else{
            height += h;
            setHeight(height);
        }
    }
    public void defineCat(String n, String c){
        setName(n);
        setColor(c);
    }
    public void speak(){
        System.out.println("Name : "+name);
        System.out.println("Color : "+color);
        System.out.println("Height : "+height);
        System.out.println("Weight : "+weight);
    }
}
