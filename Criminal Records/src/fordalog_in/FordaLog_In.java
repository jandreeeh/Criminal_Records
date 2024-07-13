package fordalog_in;

//Imports

//================

//Process
public class FordaLog_In {

    //Show up
    public static void main(String[] args) 
    {
       new DatabaseConnection();
       MainMenu MainMenuFrame = new MainMenu ();
       MainMenuFrame.setVisible(true);
       MainMenuFrame.pack();
       MainMenuFrame.setLocationRelativeTo(null);
       System.out.println("New Commit");
        
        
    }
}
