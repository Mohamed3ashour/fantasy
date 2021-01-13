package fpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.sql.*;
public class DataManipulation {
	
	public static void Display_User_Data() throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user ID : ");
		String ID = sc.nextLine();
		ResultSet myRs1=stmt.executeQuery("select * from users where UID ='"+ID+"'");
		int userID = 0;
		String UserName = "" , favTeam = "" , email = "";
		
    	while(myRs1.next()) 
    	{
    		userID = myRs1.getInt("UID");
    		UserName = myRs1.getString("User_name");
    		favTeam = myRs1.getString("fav_team");
    		email = myRs1.getString("Email");
    	}
    	System.out.println("User ID : "+userID);
    	System.out.println("User name : "+UserName);
    	System.out.println("User Email adress : "+email);
    	System.out.println("User fav team : "+favTeam);
    	
    	sc.close();
	}
	
	public static boolean Display_Player_Data() throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user name : ");
		String name = sc.nextLine();
		System.out.print("Enter user position : ");
		String pos = sc.nextLine();
		
		ResultSet myRs1;
		
		switch(pos)
		{
		case "df":
			myRs1=stmt.executeQuery("SELECT Player_name , Team , Total_points , Cost , Position FROM defenders WHERE Player_name ='"+name+"';");
			break;
		case "mf":
			myRs1=stmt.executeQuery("SELECT Player_name , Team , Total_points , Cost , Position FROM midfielders WHERE Player_name ='"+name+"';");
			break;
		case "GK":
			myRs1=stmt.executeQuery("SELECT Player_name , Team , Total_points , Cost , Position FROM goalkeepers WHERE Player_name ='"+name+"';");
			break;
		case "fw":
			myRs1=stmt.executeQuery("SELECT Player_name , Team , Total_points , Cost , Position FROM farwards WHERE Player_name ='"+name+"';");
			break;
			default:
			System.out.println("Invalid player position");
			sc.close();
			return false;
		}
		
		int points = 0;
		double cost = 0.0;
		String PlayerName = "" , team = "" , position = "";
		
    	while(myRs1.next()) 
    	{
    		PlayerName = myRs1.getString("Player_name");
    		team = myRs1.getString("Team");
    		points = myRs1.getInt("Total_points");
    		cost = myRs1.getDouble("Cost");
    		position = myRs1.getString("Position");	
    	}
    	
    	System.out.println("Player name : "+PlayerName);
    	System.out.println("team : "+team);
    	System.out.println("Total points : "+points);
    	System.out.println("Cost : "+cost);
    	System.out.println("Position : "+position);
    	
    	sc.close();
    	return true;
	}
	
	public static boolean lookUpForTeam(String team) throws FileNotFoundException, SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		String sql = "SELECT Team_name FROM premier_league_teams WHERE Team_name='"+team+"';";
		ResultSet res = stmt.executeQuery(sql);
		while(res.next())
		{
			return true;
		}
		return false;
	}
	
	public static boolean search_midfielders(String name) throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement(); 
		String sql="SELECT * FROM midfielders WHERE Player_name= '"+name+"'";
		ResultSet res=stmt.executeQuery(sql);
		while(res.next())
		{
			return true;
		}
	    return false;
	}
	
	public static boolean search_farwards(String name) throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement(); 
		String sql="SELECT * FROM farwards WHERE Player_name= '"+name+"'";
		ResultSet res=stmt.executeQuery(sql);
		while(res.next())
		{
			return true;
		}
	    return false;
	}

	public static boolean search_goalkeepers(String name) throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement(); 
		String sql="SELECT * FROM goalkeepers WHERE Player_name= '"+name+"'";
		ResultSet res=stmt.executeQuery(sql);
		while(res.next())
		{
			return true;
		}
	    return false;
	}

	public static boolean search_defenders(String name) throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement(); 
		String sql="SELECT * FROM defenders WHERE Player_name= '"+name+"'";
		ResultSet res=stmt.executeQuery(sql);
		while(res.next())
		{
			return true;
		}
	    return false;
	}
	
	public static boolean search_for_player_in_squad(String pname) throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement(); 
		String sql="SELECT * FROM squads WHERE Player_name= '"+pname+"'";
		ResultSet res=stmt.executeQuery(sql);
		while(res.next())
		{
			return true;
		}
	    return false;
	}
	
	public static boolean dataValidation(User newUser) throws FileNotFoundException, SQLException
	{
		String subEmail = newUser.getEmail().substring(newUser.getEmail().length()-4);
		
		if(newUser.getEmail().contains("@")
		&& subEmail.equalsIgnoreCase(".com")
		&& !newUser.getEmail().contains(" ")
		&& newUser.getName().length()<=25 
		&& lookUpForTeam(newUser.getFavTeam())
		&& newUser.getPasswd().length()>=8
		)
			return true;
		return false;
	}
	
	public static boolean checkUserDatabase(String Email, String passwd) throws FileNotFoundException, SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		String sql="SELECT * FROM users WHERE Email= '"+Email+"' and Passwd='"+passwd+"' ";
		ResultSet res=stmt.executeQuery(sql);
		while(res.next())
		{
			return true;
		}
	   return false;
	}
	
	public static void addUser(User newUser) throws IOException, SQLException
	{
		int UID = 0;
		
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet res;
		
		String sql="INSERT INTO users"
				+"(User_name,Fav_team,Email,Passwd)"
				+"values('"+newUser.getName()+"','"+newUser.getFavTeam()+"','"+newUser.getEmail()+"','"+newUser.getPasswd()+"')";
		
		stmt.execute(sql);
		System.out.println("New user has been added");
		
		String sql2="SELECT UID FROM users WHERE User_name='"+newUser.getName()+"';";
		res = stmt.executeQuery(sql2);
		while(res.next())
			UID = res.getInt("UID");
		
		System.out.print("Your UID : "+UID);
	}
	
	public static void printUsers() throws FileNotFoundException, SQLException
	{	
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet myRs = stmt.executeQuery("SELECT * FROM users");
    	while(myRs.next()) 
    	{
    		System.out.println(myRs.getString("UID")+"\t"+myRs.getString("User_name")+"\t"+myRs.getString("Fav_team")+"\t"+myRs.getString("Email"));    	
		}	
	}
	
	public static void printmidfielders() throws FileNotFoundException, SQLException
	{	
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet myRs = stmt.executeQuery("SELECT * FROM midfielders");
    	while(myRs.next())
    	{
    		System.out.println(myRs.getString("Player_name")+"\t"+myRs.getString("Team")+"\t"+myRs.getString("Total_points")+"\t"+myRs.getString("Cost"));
    	}
	}	
}
