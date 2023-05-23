
import java.awt.Font;
import java.util.Calendar;
import javax.swing.*;

/*
 * tuntun
 */

/**
 *
 * @author tunkuki
 */
public class Timer extends JLabel implements Runnable{
    private int num = 0;
    private boolean pause = false;
    @Override
    public void run() {
        try {
            while(true){
                Thread.sleep(1000);
                int sec = num%60;
                int min = (num/60)%60;
                int hour = (num/3600)%24;
                this.setFont(new Font("Arial", Font.ITALIC, 80));
                this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                num++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public synchronized void pause(){
        wait();
    }
}
