public class Enrollment
{
	public String getEnrollmentInfo(String platform, String course, String student)	
	{
		return "Platform :"+ platform + "\nCourse :"+ course +"\nStudent :"+ student;
	}
	public static void main(String args[])
	{
		Enrollment enroll=new Enrollment();
		String result=enroll.getEnrollmentInfo("Udemy","Java Programming","Alice");
		System.out.println(result);
		System.out.println("------------------------------------------------");
		String result1=enroll.getEnrollmentInfo("Udemy","Web Development","Bob");
		System.out.println(result1);
		System.out.println("------------------------------------------------");

	}
}
