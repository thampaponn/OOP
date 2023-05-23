/*
 * tuntun
 */
package week9;

/**
 *
 * @author tunkuki
 */
public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing"); 
        Account acct1 = new Account(5000, "Somsri01"); 
        Account acct2 = new Account(3000, "Somsri02"); 
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        // ทดลองฝากเงนิ ถอนเงนิ ในบญั ชตี ่างๆ 
        cust.getAccount(0).withdraw(3000); 
        cust.getAccount(1).deposit(3000);
        // แสดงขอ้ มลู ของลกู คา้ เชน่ Somsri Boonjing has 2 accounts. 
        System.out.println(cust);
        // ทดลองสรา้ งบญั ชแี ละเพมิE บญั ชนี นัF ๆ ใหก้ บั ลกู คา้ มากกวา่ 5 บญั ชี
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        } 
    }
    
}
