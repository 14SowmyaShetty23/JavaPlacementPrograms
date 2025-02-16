//program to demonstrate  loop


class Loop
{
   
    public void loopWhile()
    {
        System.out.println("using while loop");
        int i=0;
        while(i<5)
        {
            System.out.print(i+"\t");
            i++;
        }
        System.out.print("\n");
    }
    public void loopFor()
    {
        System.out.println("using for loop");
        for(int i=0;i<5;i++)
    {
        System.out.print(i+"\t");
    }
    System.out.print("\n");
    }
    
   
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Loop ob =new Loop();
	    ob.loopWhile();
	    ob.loopFor();
	}
}
