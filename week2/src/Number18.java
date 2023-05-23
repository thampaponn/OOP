/*
 * tuntun
 */
package week2;

import java.util.Scanner;
/**
 *
 * @author tunkuki
 */
public class Number18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input tower height : ");
        int height = input.nextInt();
        for(int i = 1; i <= height; i++){
            System.out.println("#-#-#-#-#");
        }
    }
}
