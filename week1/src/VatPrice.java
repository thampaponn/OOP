
package week1;

import java.util.Scanner;

/**
 *
 * @author tunkuki
 */
public class VatPrice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        double x = (money) * (0.07);
        double ans = money + x;
        System.out.println(ans);
    }
}
