package week1;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double ans = Math.PI*radius*radius;
        System.out.println(ans);
    }
}
