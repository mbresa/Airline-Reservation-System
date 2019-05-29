import java.util.ArrayList;
import javax.swing.*;

public class Reservation
{    
   static ArrayList<AvailableTicket> AvailableTicketList = new ArrayList<AvailableTicket>();
   static ArrayList<Passenger> PassengerList = new ArrayList<Passenger>();
   static ArrayList<ReservedTicket> ReservedTicketList = new ArrayList<ReservedTicket>();
   private AvailableTicket available;
   private int rows=3;
   private int columns=4;

   
   
   
   
        
   
   private void addTicket(){
   	 //create new book object with status "Available."
      String row=JOptionPane.showInputDialog(" Enter row: ");
   
      String column=JOptionPane.showInputDialog(" Enter column: ");
   
      String flight_ID=JOptionPane.showInputDialog(" Enter flight ID: ");
          
      AvailableTicket t=new AvailableTicket(flight_ID);
      AvailableTicketList.add(t);
      JOptionPane.showMessageDialog(null,"done");
   }
   
      
   public void displayAvailableTicketList()
   {    System.out.println("\n"+"\n"+"TICKET NUMBER "+"                 TICKET ID ");
      for (int i=0; i < AvailableTicketList.size(); i++)     
      {
         System.out.println("  "+(i+1)+"                         "+AvailableTicketList.get(i).displayTicket());}
   }     		
   
   public void displayReservedTicketList()
   {System.out.println("\n"+"\n"+"TICKET NUMBER "+"                 TICKET ID ");
      for (int i = 0; i < ReservedTicketList.size(); i++)     
      { System.out.println("  "+(i+1)+"                         "+ReservedTicketList.get(i).displayTicket());}     
   }		

   			
   

   public  void addPassenger(String a){
   	 //create new book object with status "Available."
      String name=JOptionPane.showInputDialog(" ENTER YOU NAME : ");
   
      String surname=JOptionPane.showInputDialog("ENTER YOUR SURNAME ");
             
      Passenger pass=new Passenger(name,surname,a);
      PassengerList.add(pass);
      JOptionPane.showMessageDialog(null,"YOU ARE ADDED AS A PASSENGER WITH TICKET ID "+a);   }

   public void displayPassengerList()
   {
      if (PassengerList.size() != 0)
      {
         for (int i = 0; i < PassengerList.size(); i++)
         {JOptionPane.showMessageDialog(null,PassengerList.get(i).displayPassenger());
         }         
      }
      else {   
         JOptionPane.showMessageDialog(null,"THERE ARE NO PASSENGERS REGISTERES YET");
      } 					
                					
   }

 
   public void reservTicket()
   {int p=1;
      int s=new Integer(JOptionPane.showInputDialog(" HOW MANY TICKET WOULD YOU LIKE TO RESERV ")).intValue();
      if(s>=5)
      {JOptionPane.showMessageDialog(null,s+" TICKETS ARE NOT ALLOWED TO BE RESERVED");}
      else{ 
         while(p<=s) 
         { JOptionPane.showMessageDialog(null," THESE ARE ALL TICKETS THAT CAN BE RESERVED");
            displayAvailableTicketList();
            String k=JOptionPane.showInputDialog("CHOSE An AVAILABLE TICKET FROM THE BELOW LIST AND WRITE DOWN IT'S NUMNER");
            String ticket_ID=JOptionPane.showInputDialog(" ENTER YOUR TICKET ID");
            addPassenger(ticket_ID);
            AvailableTicketList.remove(new Integer(k).intValue()-1);
            ReservedTicketList.add(new ReservedTicket(ticket_ID));
            p++;
         }
      }		
   }
   
   public void cancelTicket()
   {
      if(ReservedTicketList.isEmpty())
      {JOptionPane.showMessageDialog(null,"THERE ARE NO TICKET RESERVED ");}
      else{ JOptionPane.showMessageDialog(null,"THESE ARE ALL THE RESERVED TICKETS");
         displayReservedTicketList();
         String l=JOptionPane.showInputDialog("ENTER THE TICKET NUMBER YOU WOULD LIKE TO CANCEL"); 
         String l1=JOptionPane.showInputDialog("ENTER THE TICKET ID YOU WOULD LIKE TO CANCEL"); 
         AvailableTicket ava=new AvailableTicket(l1);
         ReservedTicketList.remove(new Integer(l).intValue()-1);
         AvailableTicketList.add(ava); 
         JOptionPane.showMessageDialog(null,"TICKET WITH ID "+l1+" HAS BEEN CANCELED");}
      	
   }
   public void name()
   {
      for(int i=1; i<=columns; i++)
      {
         for(int j=1; j<=rows; j++)
         {
            {AvailableTicketList.add(new AvailableTicket(i+"-"+j));}}}
   }
     // System.out.println(AvailableTicketList.size());
}   	



   
