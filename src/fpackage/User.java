package fpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.sql.*;

public class User extends person {
	
	Scanner sc;
	
	private String email;
	private String passwd;
	private String favTeam;
	private String ID;
	private double budget;
	
	public User() {
		super();
		email="";
		passwd="";
		favTeam = "";
		setBudget(100.0);
	}
	
	public User(String name, int age, String email, String passwd , String favTeam) {
		super(name , age);
		this.email = email;
		this.passwd = passwd;
		this.favTeam = favTeam;
		setBudget(100.0);
	}
	
	public Player CreatePlayer()
	{
		sc = new Scanner(System.in);
		Player newPlayer = new Player();
		System.out.print("Enter player name : ");
		newPlayer.setName(sc.nextLine());
		System.out.print("Enter player nationality : ");
		newPlayer.setNationality(sc.nextLine());
		System.out.print("Enter player team name : ");
		newPlayer.setTeam(sc.nextLine());
		System.out.print("Enter player position : ");
		newPlayer.setPosition(sc.nextLine());
		System.out.print("Enter player cost : ");
		newPlayer.setCost(sc.nextDouble());
		System.out.print("Enter player age : ");
		newPlayer.setAge(sc.nextInt());
		System.out.print("Enter player points : ");
		newPlayer.setPoints(sc.nextInt());
		System.out.println();
		return newPlayer;
	}

	public void Add_Midfielder_To_Squad() throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		int ID = 0 ; String Name = "";
		
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		ID = sc.nextInt();
		
		System.out.println("Enter name for midfielder player");
		Name = scan.nextLine();
		
		if(DataManipulation.search_midfielders(Name))
		{
			
			String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM midfielders WHERE Player_name='"+Name+"'";
			
			ResultSet res = stmt.executeQuery(sql);
			
			String name="" , team="" , position="";
			int points = 0;
			double cost = 0.0;
			
			while(res.next())
			{				
				name = res.getString("Player_name");
				team = res.getString("Team");
				points = res.getInt("Total_points");
				cost = res.getDouble("Cost");
				position = res.getString("Position");
			}
			
			String sql2 = "INSERT INTO squads"
						+"(UID , PID ,Player_name,Team,Total_points,Cost,Position)"
						+"Values("+ID+", '"+PID(ID , Name)+"' ,'"+name+"','"+team+"','"+points+"','"+cost+"','"+position+"');"; 
			
			stmt.executeUpdate(sql2);
			System.out.println("Player has been added");
		}
		else
		{
			System.out.println("Player name does not exist!");
			System.out.println("Try again");
		}
		
		scan.close();
		sc.close();
	}
	
	public void Add_Defender_To_Squad() throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		int ID = 0 ; String Name = "";
		
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		ID = sc.nextInt();
		
		System.out.println("Enter name for defender player");
		Name = scan.nextLine();
		
		if(DataManipulation.search_defenders(Name))
		{
			
			String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM defenders WHERE Player_name='"+Name+"'";
			
			ResultSet res = stmt.executeQuery(sql);
			
			String name="" , team="" , position="";
			int points = 0;
			double cost = 0.0;
			
			while(res.next())
			{				
				name = res.getString("Player_name");
				team = res.getString("Team");
				points = res.getInt("Total_points");
				cost = res.getDouble("Cost");
				position = res.getString("Position");
			}
			
			String sql2 = "INSERT INTO squads"
						+"(UID , PID ,Player_name,Team,Total_points,Cost,Position)"
						+"Values("+ID+", '"+PID(ID , Name)+"' ,'"+name+"','"+team+"','"+points+"','"+cost+"','"+position+"');"; 
			
			stmt.executeUpdate(sql2);
			System.out.println("Player has been added");
		}
		else
		{
			System.out.println("Player name does not exist!");
			System.out.println("Try again");
		}
		
		scan.close();
		sc.close();
	}
	
	public void Add_Farward_To_Squad() throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		int ID = 0 ; String Name = "";
		
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		ID = sc.nextInt();
		
		System.out.println("Enter name for farward player");
		Name = scan.nextLine();
		
		if(DataManipulation.search_farwards(Name))
		{
			
			String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM farwards WHERE Player_name='"+Name+"'";
			
			ResultSet res = stmt.executeQuery(sql);
			
			String name="" , team="" , position="";
			int points = 0;
			double cost = 0.0;
			
			while(res.next())
			{				
				name = res.getString("Player_name");
				team = res.getString("Team");
				points = res.getInt("Total_points");
				cost = res.getDouble("Cost");
				position = res.getString("Position");
			}
			
			String sql2 = "INSERT INTO squads"
						+"(UID , PID ,Player_name,Team,Total_points,Cost,Position)"
						+"Values("+ID+", '"+PID(ID , Name)+"' ,'"+name+"','"+team+"','"+points+"','"+cost+"','"+position+"');"; 
			
			stmt.executeUpdate(sql2);
			System.out.println("Player has been added");
		}
		else
		{
			System.out.println("Player name does not exist!");
			System.out.println("Try again");
		}
		
		scan.close();
		sc.close();
	}
	
	public void Add_Goalkeeper_To_Squad() throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		int ID = 0 ; String Name = "";
		
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		ID = sc.nextInt();
		
		System.out.println("Enter name for goalkeeper player");
		Name = scan.nextLine();
		
		if(DataManipulation.search_goalkeepers(Name))
		{
			
			String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM goalkeepers WHERE Player_name='"+Name+"'";
			
			ResultSet res = stmt.executeQuery(sql);
			
			String name="" , team="" , position="";
			int points = 0;
			double cost = 0.0;
			
			while(res.next())
			{				
				name = res.getString("Player_name");
				team = res.getString("Team");
				points = res.getInt("Total_points");
				cost = res.getDouble("Cost");
				position = res.getString("Position");
			}
			
			String sql2 = "INSERT INTO squads"
						+"(UID , PID ,Player_name,Team,Total_points,Cost,Position)"
						+"Values("+ID+", '"+PID(ID , Name)+"' ,'"+name+"','"+team+"','"+points+"','"+cost+"','"+position+"');"; 
			
			stmt.executeUpdate(sql2);
			System.out.println("Player has been added");
		}
		else
		{
			System.out.println("Player name does not exist!");
			System.out.println("Try again");
		}
		
		scan.close();
		sc.close();
	}
	
	public void Remove_Player_From_Squad() throws SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		String pid="";
		System.out.println("Enter PID : ");
		pid=scan.nextLine();
		
		String sql = "DELETE FROM squads WHERE PID='"+pid+"';";
		stmt.execute(sql);
		scan.close();
	}
	
	public String PID(int id , String uname)
	{
		String pid = uname.concat(Integer.toString(id));
		return pid;
	}
	
	public void AddSquad() throws IOException, SQLException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		
		int ID=0; String Name="";
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		ID = sc.nextInt();
		
		System.out.println("\nMidfielders\n");
		
		for(int i = 0; i<5 ;i++)
		{	
			System.out.println("Enter name for midfielder player #"+(i+1));
			Name = scan.nextLine();
			
			if(DataManipulation.search_midfielders(Name))
			{
				
				String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM midfielders WHERE Player_name='"+Name+"'";
				
				ResultSet res = stmt.executeQuery(sql);
				
				String name="" , team="" , position="";
				int points = 0;
				double cost = 0.0;
				
				while(res.next())
				{				
					name = res.getString("Player_name");
					team = res.getString("Team");
					points = res.getInt("Total_points");
					cost = res.getDouble("Cost");
					position = res.getString("Position");
				}
				
				String sql2 = "INSERT INTO squads"
							+"(UID , PID ,Player_name,Team,Total_points,Cost,Position)"
							+"Values("+ID+", '"+PID(ID , Name)+"' ,'"+name+"','"+team+"','"+points+"','"+cost+"','"+position+"');"; 
				
				stmt.executeUpdate(sql2);
			}
			else
			{
				System.out.println("Player name does not exist!");
				System.out.println("Try again");
				--i;
			}
		}
		
		System.out.println("\nForwards\n");
		
		for(int i = 0; i<3 ;i++)
		{	
			System.out.println("Enter name for farward player #"+(i+1));
			Name = scan.nextLine();
			
			if(DataManipulation.search_farwards(Name))
			{
				String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM farwards WHERE Player_name='"+Name+"'";
				
				ResultSet res = stmt.executeQuery(sql);
				
				String name="" , team="" , position="";
				int points = 0;
				double cost = 0.0;
				
				while(res.next())
				{				
					name = res.getString("Player_name");
					team = res.getString("Team");
					points = res.getInt("Total_points");
					cost = res.getDouble("Cost");
					position = res.getString("Position");
				}
				
				String sql2 = "INSERT INTO squads"
							+"(UID, PID ,Player_name,Team,Total_points,Cost,Position)"
							+"Values("+ID+", '"+PID(ID , Name)+"' ,'"+name+"','"+team+"','"+points+"','"+cost+"','"+position+"');"; 
				
				stmt.executeUpdate(sql2);
			}
			else
			{
				System.out.println("Player name does not exist!");
				System.out.println("Try again");
				--i;
			}
		}
		
		System.out.println("\nDefenders\n");
		
		for(int i = 0; i<5 ;i++)
		{	
			System.out.println("Enter name for defenders player #"+(i+1));
			Name = scan.nextLine();
			
			if(DataManipulation.search_defenders(Name))
			{
				String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM defenders WHERE Player_name='"+Name+"'";
				
				ResultSet res = stmt.executeQuery(sql);
				
				String name="" , team="" , position="";
				int points = 0;
				double cost = 0.0;
				
				while(res.next())
				{				
					name = res.getString("Player_name");
					team = res.getString("Team");
					points = res.getInt("Total_points");
					cost = res.getDouble("Cost");
					position = res.getString("Position");
				}
				
				String sql2 = "INSERT INTO squads"
							+"(UID, PID ,Player_name,Team,Total_points,Cost,Position)"
							+"Values("+ID+", '"+PID(ID , Name)+"' ,'"+name+"','"+team+"','"+points+"','"+cost+"','"+position+"');"; 
				
				stmt.executeUpdate(sql2);
			}
			else
			{
				System.out.println("Player name does not exist!");
				System.out.println("Try again");
				--i;
			}
		}
		
		System.out.println("\nGoalkeepers\n");
		
		for(int i = 0; i<2 ;i++)
		{	
			System.out.println("Enter name for goalkeeper player #"+(i+1));
			Name = scan.nextLine();
			
			if(DataManipulation.search_goalkeepers(Name))
			{
				String sql = "SELECT Player_name , Team , Total_points , Cost , Position FROM goalkeepers WHERE Player_name='"+Name+"'";
				
				ResultSet res = stmt.executeQuery(sql);
				
				String name="" , team="" , position="";
				int points = 0;
				double cost = 0.0;
				
				while(res.next())
				{				
					name = res.getString("Player_name");
					team = res.getString("Team");
					points = res.getInt("Total_points");
					cost = res.getDouble("Cost");
					position = res.getString("Position");
				}
				
				String sql2 = "INSERT INTO squads"
							+"(UID, PID ,Player_name,Team,Total_points,Cost,Position)"
							+"Values("+ID+", '"+PID(ID , Name)+"' ,'"+name+"','"+team+"','"+points+"','"+cost+"','"+position+"');"; 
				
				stmt.executeUpdate(sql2);
			}
			else
			{
				System.out.println("Player name does not exist!");
				System.out.println("Try again");
				--i;
			}
		}
		
		sc.close();
		scan.close();
		System.out.println("Squad has been created!");
	}
	
	public boolean logIn() throws SQLException, FileNotFoundException
	{
		return registeration.Login();
	}
	
	public boolean signUp() throws IOException, SQLException
	{
		return registeration.SignUP();
	}
	
	public String getID()
	{
		return ID;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getPasswd() {
		return passwd;
	}

	public void setFavTeam(String favTeam) {
		this.favTeam = favTeam;
	}
	
	public String getFavTeam() {
		return favTeam;
	}
	
	public double getBudget() {
		return budget;
	}
	
	public void setBudget(double budget) {
		this.budget = budget;
	}
}
