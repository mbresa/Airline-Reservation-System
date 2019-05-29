import javax.swing.*;
public class Passenger
{  private String name;
   private String surname;
   private String ticket_ID;
  
   public Passenger(String name,String surname,String ticket_ID)
   {
      this.name=name;
      this.surname=surname;
      this.ticket_ID=ticket_ID;
   }
         
    
   public String displayPassenger(){
      String passenger_info="----------------------------"+
         			                                             "\nName:                  "+name+
         		                                               	"\nSurname:                 "+surname+ 
                                                               "\nTicket ID:                "+ticket_ID+	
                                                     			   "\n----------------------------";
     return passenger_info;   		
   }

}