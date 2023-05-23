/*
 * tuntun
 */
package week4;

/**
 *
 * @author tunkuki
 */
public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;
    public void setPlayerNumber(int n){
        playerNumber = n;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }
    public void setPosition(String p){
        position = p;
    }
    public String getPosition(){
        return position;
    }
    public boolean isSamePosition(FootballPlayer p){
        if(p.getPosition().equals(this.position)){
            return true;
        }
        else{
            return false;
        }
    }
}
