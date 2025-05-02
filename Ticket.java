public class Ticket
{
	public String getTicketInfo(String theaterName, String movieName, String seatNo)	
	{
		return "Theater Name :"+ theaterName + "\nMovie Name:"+ movieName +"\nSeatNo :"+ seatNo;
	}
	public static void main(String args[])
	{
		Ticket ticket=new Ticket();
		String result=ticket.getTicketInfo("Galaxy Cinemas","Interstellar","A10");
		System.out.println(result);
		System.out.println("------------------------------------------------");
		String result1=ticket.getTicketInfo("Galaxy Cinemas","Interception","B12");
		System.out.println(result1);
		System.out.println("------------------------------------------------");

	}
}
