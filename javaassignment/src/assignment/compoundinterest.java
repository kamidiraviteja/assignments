package assignment;

import java.util.Scanner;

public class compoundinterest {
	public static void main(String []args) {
		 int principal,time,compoundinterest;
		 double amount,rate,ci;
		 Scanner st= new Scanner (System.in);
		  System.out.print("Enter the principal amount : ");
		 principal=st.nextInt();
		   System.out.print("Enter the rate of Interest : ");
		  rate=st.nextFloat();
		 System.out.println("Enter the rate of time in year : ");
		 time=st.nextInt();
		 System.out.println("Enter the  type of compund interest  :yeraly/half-yearly");
		 compoundinterest=st.nextInt();
		 amount=principal*Math.pow((1+rate/(compoundinterest*100)),(compoundinterest*time));
	     ci=amount-principal;
	     System.out.println("The Compound interest is :"+ci);
		}

}
