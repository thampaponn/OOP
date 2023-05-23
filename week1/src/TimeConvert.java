/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author tunkuki
 */
public class TimeConvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hours : ");
        int hrs = input.nextInt();
        System.out.print("Mins : ");
        int min = input.nextInt();
        int ans = (hrs*(60*60)) + (min*60);
        System.out.println("Secs = " + ans);
    }
}
