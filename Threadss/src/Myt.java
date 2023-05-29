
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ovi
 */
public class Myt extends Thread {
    @Override
    public void run(){
        
        for(int i = 1 ;i<=10;i++){  
            if(i==6){
                continue;
            }
        System.out.println(+i+"Myt1");
        
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Myt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

