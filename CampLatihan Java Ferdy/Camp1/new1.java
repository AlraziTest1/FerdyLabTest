import java.util.Scanner;
import java.io.IOException;

public class new1{
	
	// command deleter
	//  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	
		public static void main(String[] args)throws IOException, InterruptedException{
			Scanner cin = new Scanner(System.in);
			
			int pHeal = 100;
			int pAtk = 10;
			int speed = 1;
			String name;
			String optionA;
			optionA = "LOCK CODE";
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();	// flushhhhhhhhhhh
			
			System.out.println("========== Ferdy game,but Java ==========");
			System.out.println("\n");
			
			while(optionA !="1"){
				System.out.println("========== MENU ==========");
				System.out.println("1 = Start");
				System.out.println("2 = Nothing");
				
				System.out.print("Choice : ");
				
				optionA = cin.nextLine();
				System.out.println(optionA);
				
				if (optionA =="2"){
					System.out.print("a");
				}
				
			}
			
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.print("Enter your le name :");
			name = cin.nextLine();
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.print("Hello,"+ name);
			
			
			
		
		}
	}
