package StudyCards;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Manager manager = new Manager();
		boolean constant = true;
		
		while(constant) { //CLI - Main Menu
			System.out.println("---- StudyCards ---- ---- Made By Tameem Husayn ---- ----");
			System.out.println("1. Create");
			System.out.println("2. View");
			System.out.println("3. Quiz");
			System.out.println("4. Save");
			System.out.println("Enter an option:");
			
			int choice = input.nextInt();
			input.nextLine();
			
			switch (choice) {
			case 1: //Prompts user to create both question, and answer. Or with any other functional use.
				System.out.println("Enter question/1st half");
				String ques = input.nextLine();
				
				System.out.println("Enter answer/2nd half");
				String ans = input.nextLine();
				
				manager.create(ques, ans);
				System.out.println("Creation complete.");
				break;
				
			case 2: //View created cards.
				manager.view();
				break;
			
			case 3: //User can use this option to quiz themselves.
				manager.study(input);
				break;
			
			case 4: //Starts the file log process.
			manager.save();
			System.out.println("Saved.");
			break;
			
			default: //Handles invalid input.
				System.out.println("The text you have entered does not seem to match a corresponding option.");
				
				
				
			}
			
		}
		
		input.close();

	}

}
