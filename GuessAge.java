/**
*@program:GuessAge.java
*@Description:put in age
*@author:yangmengsi123
*@date:2019/9/23
*/
import java.util.Scanner;

public class GuessAge{
	public static void main(String[] args){
		
		System.out.print("Please enter your age:");
		//System.out.print("1.Less than 18 years old 2.More than or equal to 18 years old");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int check = age/18;
		switch(check){
			case 0:
			System.out.print("You are a small girl");
			break;
			case 1:
			System.out.print("You are a big girl");
			break;
			default:
			System.out.print("You are an aunt");
			break;
		 }
	  }
		
   }

