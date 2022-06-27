package assignment;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main (String[] args) {
		int intialvalue=0,value,temperare;
		System.out.println("Enter the value to check");
		Scanner number=new Scanner(System.in);
		int finalvalue=Integer.parseInt(number.nextLine());
		temperare=finalvalue;
		while(finalvalue>0) {
			value=finalvalue%10;
			finalvalue=finalvalue/10;
			intialvalue=intialvalue+(value*value*value);
		}
		if(temperare==intialvalue) {
			System.out.println("It is a Amstrong number");
		}
			else {
				System.out.println("It is not a Amstrong number");
			}
			}
		}
