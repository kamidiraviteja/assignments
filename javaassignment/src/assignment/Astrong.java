package assignment;



public class Astrong {
	public static void main (String[] args) {
		int intialvalue=0,value,temperare,startingvalue,finalvalue;
		for(startingvalue=100;startingvalue<=999;startingvalue++) {
			intialvalue=0;
		finalvalue=startingvalue;
		temperare=finalvalue;
		while(finalvalue>0) {
			value=finalvalue%10;
			finalvalue=finalvalue/10;
			intialvalue=intialvalue+(value*value*value);
		}
		if(temperare==intialvalue) {
			System.out.println(" Amstrong number are :"+"\n"+temperare);
		}
		}
	}
}
