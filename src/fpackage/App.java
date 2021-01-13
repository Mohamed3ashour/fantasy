package fpackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws SQLException, IOException {
		
		User user = new User();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(1).SignUp");
		System.out.println("(2).Login");
		System.out.println("(3).Add squad");
		System.out.println("(4).Add player");
		System.out.println("(5).Remove player");
		System.out.println("(6).Update & print user's total points");
		System.out.println("(7).Update player total points");
		System.out.println("(8).Display user's squad by using user ID");
		System.out.println("(9).Display midfielders data");
		System.out.println("(10).Display all users data");
		System.out.println("(11).Display user data using user ID");
		System.out.println("(12).Exit");
		
		int op = scan.nextInt();
		
		switch(op)
		{
		case 1:
			user.signUp();
			break;
		case 2:
			user.logIn();
			break;
		case 3:
			int uid = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your ID : ");
			uid = sc.nextInt();
			
			int isAdm = 0;
			
			Connection con = ConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			ResultSet res;
			
			String sql = "SELECT IsAdmin FROM users WHERE UID="+uid+"";
			res = stmt.executeQuery(sql);
			while(res.next())
				isAdm = res.getInt("IsAdmin");
			if(isAdm==0)
				user.AddSquad(uid);
			else
				System.out.println("You are an admin");
			break;
		case 4:
			Scanner s = new Scanner(System.in);
			System.out.print("Enter player position : ");
			String op2 = s.nextLine();
			switch(op2)
			{
			case "fw":
				user.Add_Farward_To_Squad();
				break;
			case "gk":
				user.Add_Goalkeeper_To_Squad();
				break;
			case "df":
				user.Add_Defender_To_Squad();
				break;
			case "mf":
				user.Add_Midfielder_To_Squad();
				break;
			default:
				System.out.println("Invalid player position");
			}
			break;
		case 5:
			user.Remove_Player_From_Squad();
			break;
		case 6:
			System.out.println("Total points : "+Admin_user.Update_user_total_points());
			break;
		case 7:
			Scanner s2 = new Scanner(System.in);
			String name="" , pos="";
			int points=0;
			System.out.print("Enter player pos : ");
			pos = s2.nextLine();
			System.out.print("Enter player name : ");
			name = s2.nextLine();
			System.out.print("Enter player bonus points : ");
			points = s2.nextInt();
			Admin_user.Update_player_total_points(points, name, pos);
			break;
		case 8:
			Admin_user.Display_squad();
			break;
		case 9:
			DataManipulation.printmidfielders();
			break;
		case 10:
			DataManipulation.printUsers();
			break;
		case 11:
			DataManipulation.Display_User_Data();
			break;
		case 12:
			System.out.println("Exit...!");
			break;
		default:
			System.out.println("Invalid option");
		}
		
		scan.close();
	
	}
}
