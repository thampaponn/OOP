/*
 * tuntun
 */

package week9;

import java.util.ArrayList;

/**
 *
 * @author tunkuki
 */
public class Customer{
    private String firstName;
    private String lastName;
    private ArrayList acct;
//    private Account[] acct;
    private int numOfAccount;
    public Customer(){
        this("","");
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
//        acct = new Account[5];
    }
    public void addAccount(Account acct){
//        this.acct[numOfAccount] = acct;
        this.acct.add(acct);
        numOfAccount += 1;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return this.firstName + " - " + this.lastName + " " + this.numOfAccount;
    }
    public Account getAccount(int index){
        return ((Account)this.acct.get(index));
    }
    public int getNumOfAccount(){
        return this.acct.size();
    }
    public boolean equals(Customer c){
        if((firstName.equals(c.firstName)) && ((lastName.equals(c.lastName)))){
            return true;
        }
        else{
            return false;
        }
    }
}
