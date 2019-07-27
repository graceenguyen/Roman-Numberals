package code;

import java.util.Scanner;

public class Roman_Numerals {
	
	public static String romanNumerals (int number)
	{
		String roman = "";
		int mod= 0;
		int quo = number /10;
		System.out.println("Number:" + number + " quo:"+ quo);
		
		if ( number > 10)// remainder
		{mod = number % 10;}
		else// if number is single digit
			mod = number;
		
		if (number == 100) // 100
		{roman = "C" ;}
		if (quo > 4 && quo < 9) // 50-80 - first digit 10s
		{
			quo = quo - 5;
			roman = "L";
		}
		if (quo == 9) // 90
		{roman = "XC" ;}
		while (quo < 4 && quo > 0)//10 -20- 30 and X in in 10s after - WHILE NOT IF	
		{
//			System.out.println("Number:" + number + " quo:"+ quo);
			roman = roman + "X";
			quo--;
		}
		if (quo == 4) // 40
		{roman = "XL" ;}	
		if (mod == 4) // 4
		{
			roman = roman + "IV" ;
			mod =0;
//				mod = mod -1;
		}
		if (mod >= 5 && mod < 9) // 5
		{
			roman = roman + "V" ;
			mod = mod - 5;
		}
		while (mod > 0 && mod < 4) // 1-3
		{
			roman = roman + "I" ;
			mod = mod -1;
		}
		if (mod == 9) // 9
		{	roman = roman + "IX" ;}
		
		return roman;
	}
			
	public static void main (String[] args)
	{
		int number = 0;
		String output = "";
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number from 1 - 100");//instructions
		number = input.nextInt();
		output = romanNumerals (number);
		System.out.println("Roman numerals of insert number is: " + output);
		
		input.close();
	}

}
