package week1;

public class SolutionFinder {
    public static void main(String[] args){
        int a =4, b = 8, c = 3;
        double y = ((b*b) - (4*a*c));
        double x1 = (-b) + Math.sqrt(y);
        double x2 = (-b) - Math.sqrt(y);
        System.out.println(x1/(2*a));
        System.out.println(x2/(2*a));
    }
}