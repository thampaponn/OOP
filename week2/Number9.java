/*
 * tuntun
 */
package week2;

import java.util.Scanner;
/**
 *
 * @author tunkuki
 */
public class Number9 {
    public static void main(String[] args) {
        double salary;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter your salary :");
        salary = tube.nextDouble();
        double tax;
        if(salary > 50000){
            tax = salary * 0.1;
        }else{
            tax = salary * 0.05;
        }
        System.out.println(tax);
    }
}
