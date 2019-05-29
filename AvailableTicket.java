public class AvailableTicket {
  
   private String flight_ID;
   public String status;   
         
   public AvailableTicket(String flight_ID)
   { 
      this.flight_ID=flight_ID; 	
   }
   

   public String displayTicket(){
   
      String Ticketinfo = "SEAT------- "+flight_ID;
      return Ticketinfo;	
   }


 
   
   	
}
