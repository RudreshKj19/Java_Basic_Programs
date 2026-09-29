class Days1
{
	public static void main(String[] args)
	{
	 String days="Feb";
	 switch(days)
	 {
	  case "Jan","Mar","May","Jul","Aug","Oct","Dec" : System.out.println("31 Days");
	  break;
	  case "Apr","Jun","Sep","Nov" : System.out.println("30 Days");
	  break;
	  case "Feb" : System.out.println("28 or 29 Days");
	  break;
	  default : System.out.println("Invalid");
	  }
}
	
}
		