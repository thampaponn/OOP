/*
 * tuntun
 */
package week2;

import java.util.Scanner;
/**
 *
 * @author tunkuki
 */
public class Number19 {
    public static void main(String[] args) {
        Scanner tube = new Scanner(System.in);
        int number = tube.nextInt();
        System.out.print(number);
        for(int sign = 0; sign < number; sign++){
            System.out.print('=');
        }
        System.out.println('+');
    }
}
