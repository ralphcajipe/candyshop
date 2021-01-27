package rhcajipe_candyshop;
import javax.swing.JOptionPane;


public class Rhcajipe_Candyshop 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here //Declare here
        String sChoice, sCash, sQty;
        int iChoice, iChoice1 = 1, iChoice2 = 2, iChoice3 = 3;
        int price1 = 10, price2 = 20, price3 = 30;
        int iCash, iChange, YesandNo, Gumnum, Candynum, Chocsnum, Qty;


       do{
        sChoice = JOptionPane.showInputDialog(" RALPH'S STORE\n-------------------------\n1. Gum     - Php 10   \n-------------------------\n2. Candy  - Php 20   \n-------------------------\n3. Chocs - Php 30   \n-------------------------\nENTER YOUR CHOICE: ");
        iChoice = Integer.parseInt(sChoice);

        if(iChoice == iChoice1)
	{
            sCash = JOptionPane.showInputDialog("1. Gum \n Enter your cash");
            iCash = Integer.parseInt(sCash);

            while(iCash < price1)
            {
                JOptionPane.showMessageDialog(null,"YOUR BALANCE IS INSUFFICIENT!");
                sCash = JOptionPane.showInputDialog("1. Gum \n ENTER YOUR CASH");
                iCash = Integer.parseInt(sCash);
            }
            iChange =   iCash - price1;
            JOptionPane.showMessageDialog(null,"Product:\t Gum \nPrice:\t "+price1+"\nCash:\t "+iCash+"\n___________________________________\nChange:\t "+iChange,"Order Summary",-1);
        }
        
        
        else if(iChoice == iChoice2)
	{
            sCash = JOptionPane.showInputDialog("2. Candy \n ENTER YOUR CASH");
            iCash = Integer.parseInt(sCash);
            while(iCash < price2)
            {
                JOptionPane.showMessageDialog(null,"YOUR BALANCE IS INSUFFICIENT!");
                sCash = JOptionPane.showInputDialog("2. Candy \n ENTER YOUR CASH");
                iCash = Integer.parseInt(sCash);
            }
            iChange =   iCash - price2;
            JOptionPane.showMessageDialog(null,"Product:\t Candy \nPrice:\t "+price2+"\nCash:\t "+iCash+"\n___________________________________\nChange:\t "+iChange,"Order Summary",-1);
        }
        
        
        else if(iChoice == iChoice3)
	{
            sCash = JOptionPane.showInputDialog("3. Chocs \n ENTER YOUR CASH");
            iCash = Integer.parseInt(sCash);
            while(iCash < price3)
            {
                JOptionPane.showMessageDialog(null,"YOUR BALANCE IS INSUFFICIENT!");
                sCash = JOptionPane.showInputDialog("3. Chocs \n ENTER YOUR CASH");
                iCash = Integer.parseInt(sCash);
            }
            iChange =   iCash - price3;
            JOptionPane.showMessageDialog(null,"Product:\t Chocs \nPrice:\t "+price3+"\nCash:\t "+iCash+"\n___________________________________\nChange:\t "+iChange,"Order Summary",-1);
        }
		
        
        else
        {
          JOptionPane.showMessageDialog(null,"Gum, Candy and Chocs are the only ones available. \nPlease choose again.");
        }


            YesandNo = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO PURCHASE AGAIN?");
       }
	   while(YesandNo == 0);
           JOptionPane.showMessageDialog(null,"THANK YOU !","Thank You :)",-1);
        
    }
    
}
