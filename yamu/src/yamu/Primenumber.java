package yamu;

public class Primenumber {
	int b = 0;
	int a = 31;
	int n = a/2;
	
	public void number()
	{
	 for(int i=2; i<n; i++)
	 {
		 if(a%i==0)
		 {
			 System.out.println("Number is not a prime:" +a);
			 b=1;
			 break;
		 }
	 }
	     if(b==0)
		 {
			 System.out.println("Number is prime:" +a);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber c=new Primenumber();
		c.number();

	}

}
