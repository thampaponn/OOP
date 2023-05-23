/*
 * tuntun
 */
package week3;

/**
 *
 * @author tunkuki
 */
public class Fraction {
    public int topN;
    public int btmN;
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
    }
    public String toFraction(){
        return (topN+"/"+btmN);
    }
    public String toFloat(){
        double n1 = (double)topN;
        double n2 = (double)btmN;
        double result = n1/n2;
        return result+"";
    }
    public void addFraction(Fraction f){
        if(btmN == f.btmN){
            topN = topN + f.topN;
            btmN = btmN + f.btmN;
        }
        else{
            topN = (topN * f.btmN) + (f.topN * btmN);
            btmN = btmN * f.btmN;
        }

    }
}
