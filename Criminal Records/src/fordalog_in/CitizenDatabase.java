package fordalog_in;

//Imports

//import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Font;
import java.io.File;
import javax.swing.UIManager;


//================

//Process
public class CitizenDatabase {

    //Show up
    public static void main(String[] args) 
    {
       /* try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
  
        }
        catch(Exception e){
            e.printStackTrace();
        }*/
       MainMenu MainMenuFrame = new MainMenu ();
       MainMenuFrame.setVisible(true);
       MainMenuFrame.pack();
       MainMenuFrame.setLocationRelativeTo(null);
    }
    
}
