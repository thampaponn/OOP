/*
 * tuntun
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
/**
 *
 * @author tunkuki
 */
public class MyClock extends JLabel implements Runnable{

    @Override
    public void run() {
        try {
            while(true){
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                this.setFont(new Font("Arial", Font.ITALIC, 80));
                this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
