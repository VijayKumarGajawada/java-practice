//13) Write a program to accept 3 numbers and display highest number using conditions only

//PROGRAM
//-------
package niit.javaprograms;

import java.util.Scanner;

public class HighestNum {

	public static void main(String[] args) {
		HighestNumImp obj = new HighestNumImp();
		obj.highest();
	}
}

class HighestNumImp
{
	int num1;
	int num2;
	int num3;
	int max = 0;
	Scanner scan = new Scanner(System.in);
	
	void highest()
	{
		System.out.println("Enter the 1st number :");
		num1 = scan.nextInt();
		System.out.println("Enter the 2nd number :");
		num2 = scan.nextInt();
		System.out.println("Enter the 3rd number :");
		num3 = scan.nextInt();
		if (num1 > (num2 & num3))
		{
			max = num1;
		}
		if (num2 > (num1 & num3))
		{
			max = num2;
		}
		if(num3 > (num1 & num2))
		{
			max = num3;
		}
		System.out.println("Maximum number of all is : "+ max);
	}
}
