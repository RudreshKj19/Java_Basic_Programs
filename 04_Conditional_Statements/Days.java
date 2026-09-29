class Days
{
	public static void main(String[] args)
	{
	 String mm="April";
	 if(mm=="January" || mm=="March" || mm=="May" || mm=="July" || mm=="August" || mm=="October" || mm=="December")
	 {
		System.out.println(mm+" has 31 days ");
	 }
	 else if(mm=="April" || mm=="June" || mm=="September" || mm=="November")
	 {
		System.out.println(mm+" has 30 days ");
	 }
	 else if(mm=="february")
	 {
	   System.out.println(mm+" has 28 or 29 days ");
	 }
	 else
	 {
	   System.out.println("Invalid Month");
	 }
    }	
	
}
  	