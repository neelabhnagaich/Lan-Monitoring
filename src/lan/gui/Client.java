
package lan.gui;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    Socket sock;
    Scanner sc;
    public static void main(String[] args) {
        
        new Client().connector();
        
        
    }
    
    public  void connector()
    {
        try{
        sock = new Socket("Neelabh-pc",4567);
        
       }
       catch (IOException ex) {
            
           ex.printStackTrace();
        }
    }
}
