package assignment;

import java.util.Scanner;

public class Simpleinterest {
	public static void main(String []args) {
 int principal,time;
 double rate,si;
 Scanner st= new Scanner (System.in);
  System.out.print("Enter the principal amount : ");
 principal=st.nextInt();
   System.out.print("Enter the rate of Interest : ");
  rate=st.nextFloat();
 System.out.println("Enter the rate of time in year : ");
 time=st.nextInt();
 si=(principal*rate*time)/100;
 System.out.println("The sample interest is " +si);
}
}

