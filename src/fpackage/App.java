package fpackage;

import java.io.IOException;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		User user = new User();
		
		System.out.println("1.SingUp\n2.login\n3.Add squad\n4.Get you current budget\n5.Search for an user"
						+ "\n6.Display Midfielders\n7.Display Users Data\n8.Display sqaud players\n9.Exit");
		
		char option = scan.next().charAt(0);
		
		switch(option)
		{
		case '1':
			user.signUp();
			break;
		case '2':
			user.logIn();
			break;
		case '3':
			user.AddSquad();
			break;
		case '4':
			System.out.println(user.NewBudget());
			break;
		case '5':
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter user ID : ");
			String ID = sc.nextLine();
			DataManipulation.search(ID, DataManipulation.UsersFILE_PATH);
			break;
		case '6':
			DataManipulation.print(DataManipulation.MidfieldersFILE_PATH);
			break;
		case '7':
			System.out.println("\t\t\t\t\tUsers Data");
			System.out.println("======================================================="
			+ "=====================================");
			DataManipulation.print(DataManipulation.UsersFILE_PATH);
			break;
		case '8':
			user.printSquadPlayers();
			break;
		case '9':
			System.out.println("Exit...");
			break;
		default :
			System.out.println("Invalid option..");
		}
		scan.close();
	}
}
