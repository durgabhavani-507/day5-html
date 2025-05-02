public class Reservation
{
	public String getReservationDetails(String hotelName, String guestName, int nights)
	{
		return "Hotel Name :"+ hotelName+ "\nGuest Name  :"+ guestName +"\nNights :"+ nights;
	}
	public static void main(String args[])
	{
		Reservation reserve=new Reservation();
		String result=reserve.getReservationDetails("Grand Palace","David",3);
		System.out.println(result);
		System.out.println("------------------------------------------------");
		String result1=reserve.getReservationDetails("Grand Palace","Maria",2);
		System.out.println(result1);
		System.out.println("------------------------------------------------");

	}
}
		