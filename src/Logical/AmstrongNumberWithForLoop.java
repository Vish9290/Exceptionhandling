package Logical;

public class AmstrongNumberWithForLoop 
{
	
	public static void main(String[] args) 
	{
		
		int iNum1 = 1634;		
		int iRem  = 0;
		int iResult = 0;
		
		for(int iNum2 = iNum1; iNum2>=0; iNum2--)
		{
			iRem = iNum2 % 10;
			iResult = iResult + (iRem * iRem * iRem * iRem);
			iNum2 = iNum2 / 10;
		}
		
		if(iResult == iNum1)
		{
			System.out.println("Nummber is Amstong");
		}
		
		else
		{
			System.out.println("Number is not  amstrong Number");
		}
	}

}
