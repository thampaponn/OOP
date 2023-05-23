/*
 * tuntun
 */
package week9;

/**
 *
 * @author tunkuki
 */
public class Bank {
    private Account[] acct;
    private int numacct;
    public Bank(){
        acct = new Account[10];
    }
    public void addAccount(Account ac){
        acct[numacct] = ac;
        numacct += 1;
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumAccount(){
        return numacct;
    }
}
