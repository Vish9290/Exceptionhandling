package Logical;

public class AmstrongNumber 
{
	
	public static void main(String[] args)
	{
		int iNum1 = 153;
		int iNum2 = iNum1;
		int iResult = 0;
		
		int iRem = 0;
		
		while(iNum2 !=  0)
		{
			iRem = iNum2 % 10;
			iResult = iResult + (iRem * iRem * iRem);
			iNum2 = iNum2 / 10;
		}
		
		if(iResult == iNum1)
		{
			System.out.println("Number is Amstrong");
		}
		
		else
		{
			System.out.println("Number is not Amstrong");
		}
	}

}
