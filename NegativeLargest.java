class NegativeLargest
{
    public static void main(String[] args)
    {
        int a = -20;
        int b = -5;
        int c = -15;

        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println(max + " is largest");
    }
}