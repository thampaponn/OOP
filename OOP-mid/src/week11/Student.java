/*
 * tuntun
 */
package week11;

import java.io.*;
/**
 *
 * @author tunkuki
 */
public class Student implements Serializable{

    private String name;
    private int ID;
    private int money;

    public Student() {
        this("", 0, 0);
    }

    public Student(String name, int ID, int money) {
        this.name = "";
        this.ID = 0;
        this.money = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}
