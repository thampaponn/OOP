/*
 * tuntun
 */
package week6;

/**
 *
 * @author tunkuki
 */
public abstract class Player {
    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;
    public double getHP(){
        return HP;
    }
    public void setHP(double HP){
        this.HP += HP;
        if (this.HP < 0){
            this.HP = 0;
        }
    }
    public double getMP(){
        return MP;
    }
    public void setMP(double MP){
        this.MP += MP;
        if (this.MP < 0){
            this.MP = 0;
        }
    }
    public double getEXP(){
        return EXP;
    }
    public void setEXP(double EXP){
        this.EXP += EXP;
    }
    public double getMoney(){
        return Money;
    }
    public void setMoney(double Money){
        this.Money += Money;
        if (this.Money < 0){
            this.Money = 0;
        }
    }
    public double getATK(){
        return ATK;
    }
    public void setATK(double ATK){
        this.ATK += ATK;
    }
    public String toString(){
        return "HP : " + HP + " MP : " + MP + " ATK : " + ATK;
    }
    public abstract void attack(Player p);
    public abstract void attacked(double n);
}
