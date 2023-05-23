/*
 * tuntun
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author tunkuki
 */
public class Number10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert your name : ");
        String name = input.nextLine();
        System.out.print("Insert your age : ");
        int age = input.nextInt();
        System.out.print("Insert your working days : ");
        int numDay1 = input.nextInt();
        System.out.print("Insert your absent days : ");
        int numDay2 = input.nextInt();
        System.out.print("Insert your weight : ");
        int weight = input.nextInt();
        int salary = 0;
        int bonus;
        if((age >= 21)&&(age <= 30)){
            salary = (numDay1 * 300) - (numDay2 * 50);
        }else if((age >= 31)&&(age <= 40)){
            salary = (numDay1 * 500) - (numDay2 * 50);
        }
        else if((age >= 41)&&(age <= 50)){
            salary = (numDay1 * 1000) - (numDay2 * 25);
        }
        else if((age >= 51)&&(age <= 60)){
            salary = (numDay1 * 3000);
        }
        if((weight >= 10)&&(weight <= 60)){
            bonus = salary + 5000;
        }else if((weight >= 61)&&(weight <= 90)){
            bonus = salary + (5000 - ((weight - 60) * 10));
        }else{
            bonus = 0;
        }
        System.out.println("Your salary is " +salary);
        System.out.println("Your salary and bonus is " +bonus);
    }
}
