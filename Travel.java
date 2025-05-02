public class Travel
{
	public String getBookingDetails(String agency, String destination, int travellers)
	{
		return "Agency:"+ agency+ "\nDestination :"+ destination +"\nTravellers :"+ travellers;
	}
	public static void main(String args[])
	{
		Travel travel=new Travel();
		String result=travel.getBookingDetails("Wanderlust Travels","Paris",2);
		System.out.println(result);
		System.out.println("------------------------------------------------");
		String result1=travel.getBookingDetails("Wanderlust Travels","Tokyo",3);
		System.out.println(result1);
		System.out.println("------------------------------------------------");

	}
}
