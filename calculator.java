package lab08;
public class calculator 
{   
	
 int num1,num2;
	 int sum=0;

	public calculator() 
	{
		
	}

	public static void main(String[] args) 
	{
		

	}
	public Integer addition(int num1,int num2)
	{
		validateInput(num1);
		validateInput(num2);
		return num1+num2;
	}
	public Integer multipilcation(int num1,int num2)
	{
		validateInput(num1);
		validateInput(num2);
		return num1*num2;
	}
private void validateInput(int num1,int  num2) {
	if(num1 <0 && num2<0) {
		throw new IllegalArgumentException("Input must not be nagative");
	}
}
}
