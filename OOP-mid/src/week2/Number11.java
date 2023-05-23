/*
 * tuntun
 */
package week2;

import java.util.Scanner;
/**
 *
 * @author tunkuki
 */
public class Number11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = input.nextInt();
        double interest;
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        char acc = input.next().charAt(0);
        if(acc == 'A'){
            interest = money * 0.015;
        }else if(acc == 'B'){
            interest = money * 0.02;
        }
        else if(acc == 'C'){
            interest = money * 0.015;
        }
        else if(acc == 'X'){
            interest = money * 0.05;
        }
        else{
            interest = 0;
            System.out.println("Wrong account type");
        }
        System.out.println("Your total money in one year = " +(money + interest));
    }
}
