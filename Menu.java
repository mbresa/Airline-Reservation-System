import javax.swing.*;
public class Menu
{  Reservation reserv=new Reservation();
   private  int input1;
   private AvailableTicket available;
   private int input1;




   public void MainMenu()
   {
      String input=JOptionPane.showInputDialog("                                MENU "+"\n"+
                                               " CHOOSE ONE OF THE OPTIONS BELOW BY TYPING THE CORROSPONDING NUMBER : "+"\n"+
                                               "       1 - RESERV TICKET"+"\n"+
                                               "       2 - VIEW AVAILABLE TICKETS"+"\n"+
                                               "       3 - CANCEL TICKETS"+"\n"+
                                               "       4 - DISPLAY PASSENGERS"+"\n"+
                                               "       5 - EXIT");
      input1=new Integer(input).intValue();                                      
      if (input1!=1 && input1!=2 && input1!=3 && input1!=4 && input1!=5)
      {JOptionPane.showMessageDialog(null,"The number u typed is invalid,try again");}
   } 
  
 
   public void menu_1()
   {reserv.reservTicket();
      this.MainMenu(); }     

   public void menu_2()
   {reserv.displayAvailableTicketList();
      this.MainMenu();
   }
  

   public void menu_3()
   {reserv.cancelTicket();
      this.MainMenu();} 
               
               
   public void menu_4()
   {reserv.displayPassengerList();
      this.MainMenu();} 
      
   public void menu_5()
   {   System.exit(0);}    

  
 
   public void boot()
   {MainMenu();
   while(input1!=0)
     { if(input1==1)
      {this.menu_1();}
     
      if(input1==2)
      {this.menu_2();}
     
      if(input1==3)
      {this.menu_3();}
      
      if(input1==4)
      {this.menu_4();}
     
      if(input1==5)
      {System.exit(0);}
      }
   } 
    
   public static void main(String[] args)
   { new Reservation().name();
    //new Reservation().displayAvailableTicketList();
     new Menu().boot();
   }   
}
       
