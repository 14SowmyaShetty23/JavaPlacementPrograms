package javatraining;

public class digitToword {
	public static void word(int n)
	{
	String word="";	
		while(n!=0)
		{
			int r=n%10;
		
			switch(r)
			{
			case 0:
				word=" zero"+word;
				break;
			case 1:
				word=" one"+word;break;
			case 2:
				word=" two"+word;break;
			case 3:
				word=" three"+word;break;
			case 4:
				word=" four"+word;break;
			case 5:
				word=" five"+word;break;
			case 6:
				word=" six"+word;break;
			case 7:
				word=" seven"+word;break;
			case 8: 
				word= " eight"+word;break;
			case 9:
				word=" nine"+word;break;
				
			}
			n/=10;
		}
		System.out.println(word);
		
	}
	public static void main(String [] a)
	{
		word(98);
	}
}
