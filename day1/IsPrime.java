package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int num=41;
		boolean flag=false;
		if(num==1)
		{
			System.out.println("The number is neither prime nor composite");
		}
		else
		{
		for (int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		}
		
			
			if(!flag)
			{
				System.out.println(num+"is a prime number");
			}
			
			
			else {
				System.out.println(num+"is not a Prime number");
			
			}
				
	}

}
