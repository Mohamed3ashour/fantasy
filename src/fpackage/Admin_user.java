package fpackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Admin_user {

	public static int Update_user_total_points() throws SQLException
	{
		int TP = 0;
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user id : ");
		int id = scan.nextInt();
		
		String sql = "SELECT Total_points from squads where UID="+id+"";
		
		ResultSet res = stmt.executeQuery(sql);
		
		while(res.next())
		{
			TP+=res.getInt("Total_points");
		}
		
		String sql2 = "update users set Total_squad_points="+TP+" where UID="+id+";";
		
		stmt.executeUpdate(sql2);
		
		scan.close();
		return TP;
	}
	
	public static void Make_admin() throws SQLException
	{
		Scanner scan = new Scanner(System.in);
		int uid = 0;
		System.out.print("Enter User ID : ");
		uid = scan.nextInt();
		String uname = "";
		
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet res;
		
		String sql = "UPDATE users SET IsAdmin=1 WHERE UID='"+uid+"';";
		stmt.executeUpdate(sql);
		
		String sql2 = "SELECT User_name FROM users WHERE UID='"+uid+"'";
		
		res = stmt.executeQuery(sql2);
		while(res.next())
			uname = res.getString("User_name");	
		
		System.out.println(uname+" is admin");
		
		scan.close();
	}
	
	public static void Remove_admin() throws SQLException
	{
		Scanner scan = new Scanner(System.in);
		int uid = 0;
		System.out.print("Enter User ID : ");
		uid = scan.nextInt();
		String uname = "";
		
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet res;
		
		String sql = "UPDATE users SET IsAdmin=0 WHERE UID='"+uid+"';";
		stmt.executeUpdate(sql);
		
		String sql2 = "SELECT User_name FROM users WHERE UID='"+uid+"'";
		
		res = stmt.executeQuery(sql2);
		while(res.next())
			uname = res.getString("User_name");	
		
		System.out.println(uname+" is not admin any more");
		
		scan.close();
	}
	
	public static void Display_squad() throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user id : ");
		int id = scan.nextInt();
		
		String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM squads WHERE UID="+id+"";
		
		ResultSet res = stmt.executeQuery(sql);
		
		while(res.next())
		{
			System.out.println(res.getString("Player_name")+"\t"+res.getString("Team")+"\t"+res.getInt("Total_points")+"\t"+res.getDouble("Cost")+"\t"+res.getString("Position"));
		}
		
		scan.close();
	}
	
	public static boolean Update_player_total_points(int points , String name , String pos) throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet res;
		
		int newTotal = 0;
		int currentPoints = 0;
		
		switch(pos) 
		{
		case "df":
			res = stmt.executeQuery("SELECT Total_points FROM defenders"
								  + " WHERE Player_name ='"+name+"'");
			
			while(res.next()) 
				currentPoints = res.getInt("Total_points");
		
			newTotal = currentPoints+points;
			
			stmt.executeUpdate("update defenders set Total_points="+newTotal+" where Player_name ='"+name+"'");
			break;
		case "mf":
			res = stmt.executeQuery("SELECT Total_points FROM midfielders "
								  + "WHERE Player_name ='"+name+"'");
			
			while(res.next()) 
				currentPoints = res.getInt("Total_points");
			
			newTotal = currentPoints+points;
			
			stmt.executeUpdate("update midfielders set Total_points="+newTotal+" where Player_name ='"+name+"'");
			break;
		case "gk":
			res = stmt.executeQuery("SELECT Total_points FROM goalkeepers "
								  + "WHERE Player_name ='"+name+"'");
			
			while(res.next()) 
				currentPoints = res.getInt("Total_points");
			
			newTotal = currentPoints+points;
			
			stmt.executeUpdate("update goalkeepers set Total_points="+newTotal+" where Player_name ='"+name+"'");
			break;
		case "fw":
			res = stmt.executeQuery("SELECT Total_points FROM farwards"
								  + " WHERE Player_name ='"+name+"'");
			
			while(res.next()) 
				currentPoints = res.getInt("Total_points");
			
			newTotal = currentPoints+points;
			
			stmt.executeUpdate("update farwards set Total_points="+newTotal+" where Player_name ='"+name+"'");
			break;
		default:
			System.out.println("Invalid player position or name..!");
			
			return false;
		}
    	
		if(DataManipulation.search_for_player_in_squad(name))
		{
			stmt.executeUpdate("update squads set Total_points="+newTotal+" where Player_name ='"+name+"';");
		}
		else
			System.out.println("Player does not exist in any squad");
		
		System.out.println("Player's total points updated");
		
    	return true;
	}
	
	public static void show_events() throws SQLException
	{
		String name = "" , pos = "";
		
		System.out.println("Enter 0 if no events to add\n"
		 + "Please Enter 1 if player played less than or at most 60 min\n"
         + "Please Enter 2 if player played more than 60 min\n"
         + "Please Enter 3 if goalkeeper scored a goal\n"
         + "Please Enter 4 if defender scored a goal\n"
         + "Please Enter 5 if midfielder scored a goal\n"
         + "Please Enter 6 if farward scored a goal\n"
         + "Please Enter 7 if player assisted a goal\n"
         + "Please Enter 8 if goalkeeper has a clean sheet\n"
         + "Please Enter 9 if defender has a clean sheet\n"
         + "Please Enter 10 if midfielder has a clean sheet\n"
         + "Please Enter 11 if goalkeeper saved 3 shot\n"
         + "Please Enter 12 if player got a yellow card\n"
         + "Please Enter 13 if player got a red card\n"
         + "Please Enter 14 if Goalkeaper saved a penalty\n"
         + "Please Enter 15 if Goalkeaper missed a penalty\n"
         + "Please Enter 16 if player scored a goal in his team");
		
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int op = scan.nextInt();
		
		if(op==1 || op==2 || op==7 || op==12 || op==13 || op==16) {
			System.out.print("Enter player position (df,mf,gk,fw) : ");
			pos = sc.nextLine();
		}
		
		System.out.print("Enter player name : ");
		name = sc.nextLine();
		
		switch(op)
		{
		case 0:
			break;
		case 1:
			Update_player_total_points(1 , name , pos);
			break;
		case 2:
			Update_player_total_points(2, name , pos);
			break;
		case 3:
			Update_player_total_points(6, name , "gk");
			break;
		case 4:
			Update_player_total_points(6, name , "df");
			break;
		case 5:
			Update_player_total_points(5, name , "md");
			break;
		case 6:
			Update_player_total_points(4, name , "fw");
			break;
		case 7:
			Update_player_total_points(3, name , pos);
			break;
		case 8:
			Update_player_total_points(4, name , "gk");
			break;
		case 9:
			Update_player_total_points(4, name , "df");
			break;
		case 10:
			Update_player_total_points(1, name , "md");
			break;
		case 11:
			Update_player_total_points(1, name , "gk");
			break;
		case 12:
			Update_player_total_points(-1, name , pos);
			break;
		case 13:
			Update_player_total_points(-3, name , pos);
			break;
		case 14:
			Update_player_total_points(5, name , "gk");
			break;
		case 15:
			Update_player_total_points(-2, name , "gk");
			break;
		case 16:
			Update_player_total_points(-2, name , pos);
			break;
		default:
		System.out.println("Invalid option");
		}
		sc.close();
		scan.close();
	}
}
