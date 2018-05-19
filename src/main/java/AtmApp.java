import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
		
		Atm myAtm= new Atm(100);
		
		System.out.println("Enter your pin");
		String enteredPin = input.nextLine();
		
		while (!enteredPin.equals(myAtm.getRequiredPin())) {
			System.out.println("Pins do not match try again");
			enteredPin = input.nextLine();
		}	
		String choice;
		do {
			System.out.println("Welcome to Bank of We Can Code IT");
			System.out.println("Choose an option");
			System.out.println("Press 1 for deposit");
			System.out.println("Press 2 for withdraw");
			System.out.println("Press 3 for check balance");
			System.out.println("Press 4 to exit");
			choice = input.nextLine();
			
			if (choice.equals("1")) {
				System.out.println("How much would are you going to deposit?");
				int amount = input.nextInt();
				System.out.println("You chose to deposit " + money.format(amount));
				myAtm.deposit(amount);
				input.nextLine();
			
			}else if (choice.equals("2")) {	
				System.out.println("Please withdraw in multiples of 10");
				int amount = input.nextInt();
				System.out.println("You chose to withdraw " + money.format(amount));
				myAtm.withdraw(amount);
				input.nextLine();
				
			}else if (choice.equals("3")) {
			System.out.println("Your balance is " + money.format(myAtm.getBalance()));
			
			} else if (choice.equals("4")) { 
				System.out.println("Thank you for banking with us");
				System.exit(0);
				
			
			}else {
				System.out.println("I do not understand your selection. Try again");
			}
			
			
		} while (!choice.equals("4"));
		
		}
		
			
			
			
			
		
	}

