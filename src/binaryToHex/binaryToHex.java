package binaryToHex;
import java.util.Scanner;
import java.lang.Math;

public class binaryToHex
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a binary number: ");
		String binaryNumberAsString = keyboard.nextLine();
		int binaryDigitTranslated; //Binary digit after it is raised to a certain power
		int x = 0; //Exponent
		int decimalTranslation = 0; //Decimal equivalent
		
		//1011 = 11
		//Starting from end of binary number, see if digit is a 1, if so, raise 2 to the power that correlates 
			//to the bucket of the binary digit. Add up the result to a total, this will be the decimal translation
		
		for(int i = binaryNumberAsString.length()-1; i >= 0; i--)
		{
			if(binaryNumberAsString.charAt(i) == '1')
			{
				binaryDigitTranslated = (int)(Math.pow(2,  x));
				decimalTranslation = decimalTranslation + binaryDigitTranslated;
			}
			x++;
		}
		
		//The result of decimalTranslation modulus 16 produces the bucket of the number/character in the map
			//that correlates to the remainder. Add the number/character to a String. Afterwards, divide by 16
		String hexResult = "";
		String map = "0123456789ABCDEF";
		while(decimalTranslation != 0)
		{
			int temp = (decimalTranslation % 16);
			hexResult = map.charAt(temp) + hexResult;
			decimalTranslation = decimalTranslation / 16;
		}
		System.out.println("'" + binaryNumberAsString + "' in hexadecimal is '" + hexResult + "'");
	}
}
