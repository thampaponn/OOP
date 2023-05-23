/*
 * tuntun
 */

package week10;

import week5.*;

/**
 *
 * @author tunkuki
 */
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    public void withdraw(double amount) throws WithdrawException{
        if (amount > 0){
            if (this.balance - amount >= 0){
                this.balance = this.balance - amount;
                System.out.println(amount + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            }
            else if (this.balance - amount < 0 && this.balance - amount + this.credit >= 0){
                this.credit = this.balance - amount + this.credit;
                this.balance = 0;
                System.out.println(amount + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            }
            else if (this.balance - amount < 0 && this.balance - amount + this.credit < 0){
//                System.out.println("Not enough money");
                throw new WithdrawException("Account " + this.name + " has not enough money");
            }
        }
        else {
            super.withdraw(amount);
        }
        
    }
    public void withdraw(String amount) throws WithdrawException{
        this.withdraw(Double.parseDouble(amount));
    }
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
