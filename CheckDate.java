class CheckDate
{
    public static void main(String[] args)
    {
	int dd=31;
	int mm=7;
	int yy=2024;
	
	if(yy<=0 || dd<=0 || mm<=0 || mm>12 || dd>31)
	{
	System.out.println("Invalid date");
	}
	else if(dd>30 && (mm==4 || mm==6 || mm==9 || mm==11))
	{
	 System.out.println("Invalid date");
	}
	else if(dd>28 && mm==2)
	{
	if(dd==29 && (yy%4==0 && yy%100!=0 || yy%400==0))
	System.out.println("valid date");
	else
	System.out.println(" Invalid date");
	}
	else
	System.out.println(" valid date");
	}
	
}
