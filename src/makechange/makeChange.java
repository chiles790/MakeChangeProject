package makechange;
import java.util.Scanner;
public class makeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int price = 0;
		int paid = 0;
		int change = 0;
		System.out.print("Enter purchase price: ");
		price = (int)(keyboard.nextDouble() * 100);
		System.out.print("The amount tendered: ");
		paid = (int)(keyboard.nextDouble() * 100);
		// above is the 2 questions that provide us with price and the value tendered. 
		 if (paid > price) {
// beginning if statement to determine if change needs to be made or if the program can go down to "insufficient funds" and "paid in full"
	     change = paid - price;
	            
	            System.out.print("Result: ");

	            int twenties = change / 2000;
	            if(twenties >0 ) {
	            change = change % 2000; // this line in each IF statement sets the value of change to what is left following 20's 10's and so on.
	            System.out.print(twenties + " twenty dollar bill(s), ");
	            }
	            int tens = change / 1000;
	            if (tens > 0 ) {
	                change = change % 1000;
	            	System.out.print(tens + " ten dollar bill(s), "); // first attempted to do if and else if statements for all values example is: tens == 1 amd tems >1
	            }													// to remove the (s) portion of the code but kept encountering issues. 
	            int fives = change / 500;
	            if (fives >0) {
	                change = change % 500;
	            	System.out.print(fives + " five dollar bill(s), ");
	            }
	            int ones = change / 100;
	            if (ones > 0) {
	                change = change % 100;
	            System.out.print(ones + " one dollar bill(s), ");
	            }
	            int quarters = change / 25;
	            if (quarters > 0) {
	            	change = change % 25;
	            System.out.print(quarters + " quarter(s), ");
	            }
	            int dimes = change / 10;
	            if (dimes > 0 ) {
	                change = change % 10;
	            	System.out.print(dimes + " dime(s), ");
	            
	            }
	            int nickels = change / 5;
	            if (nickels >0) {
	            	change = change % 5;
	            	System.out.print(nickels + " nickel(s), ");
	            }
	            int pennies = change;
	            if (pennies >0) {
	            	System.out.print(pennies + " penny, ");
	            }
	            

	            }
		 
		 if (paid < price ) {
			 System.out.print("Error! Insufficiant funds.");
		 }
		 else if (paid == price) {
			 System.out.print("Paid in full, Have a nice day!");
			 // the above if and else if statements fulfill the insufficient funds and paid in full portions of the program.
		 }
		 
	}
	}


