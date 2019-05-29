public class ReservedTicket {
  
   private String Seat_ID;
   public String status;   
         
   public ReservedTicket(String Seat_ID)
   { 
      this.Seat_ID=Seat_ID; 	
   }
   

   public String displayTicket(){
   
      String Ticketinfo = 
         			"SEAT:             "+Seat_ID;
      return Ticketinfo;	
   }
   
   public String getSeatID()
   {return Seat_ID;}


 
   
   	
}
