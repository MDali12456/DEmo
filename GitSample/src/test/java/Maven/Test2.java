package Maven;



public class Test2 {

	public static void main(String[] args) {
	
		int sum=0;
		int n=120;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			 sum=(sum*10)+rem;
			 n=n/10;
			 
			
		}
if(temp==sum)
{

	System.out.println("It's a Palindrome");
}
else
{
	System.out.println("It's not a Palindrome");
       }
	}

}