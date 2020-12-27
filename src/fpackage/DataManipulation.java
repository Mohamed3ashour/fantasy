package fpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataManipulation {
	
	public static String UsersFILE_PATH = "C:\\Users\\HASSAN\\Desktop\\UsersList.txt";
	public static String DefendersFILE_PATH = "C:\\Users\\HASSAN\\Desktop\\Defenders.txt";
	public static String MidfieldersFILE_PATH = "C:\\Users\\HASSAN\\Desktop\\Midfielders.txt";
	public static String FarwardsFILE_PATH = "C:\\Users\\HASSAN\\Desktop\\Farwards.txt";
	public static String GoalkeepersFILE_PATH = "C:\\Users\\HASSAN\\Desktop\\GoalKeepers.txt";
	public static String SquadsFILE_PATH = "C:\\Users\\HASSAN\\Desktop\\Squads.txt";
	public static String premier_league_team_FilePath = "C:\\Users\\HASSAN\\Desktop\\premier league teams.txt";
	
	
	public static boolean lookUpForTeam(String team) throws FileNotFoundException
	{
		FileInputStream Teams = new FileInputStream(premier_league_team_FilePath);
		Scanner scan = new Scanner(Teams);
		
		while(scan.hasNextLine())
		{
			if(scan.nextLine().contains(team))
			{
				scan.close();
				return true;
			}
		}
		scan.close();
		return false;
	}
	
	public static boolean search(String Key , String filePath) throws IOException
	{
		Scanner scan;
		
		if(filePath==DataManipulation.UsersFILE_PATH)
		{
			FileInputStream UsersFile = new FileInputStream(UsersFILE_PATH);
			scan = new Scanner(UsersFile);
			String Line="";
			boolean found = false;
			if(Key.length()>=4)
			{
				while(scan.hasNextLine())
				{
					Line = scan.nextLine();
					String IDsubString = Line.substring(0, Key.length());
					if(IDsubString.equalsIgnoreCase(Key))
					{
						found = true;
						break;
					}
				}
				if(found)
				{
					int count = 0;
					for(int i=0; i<Line.length() ;i++)
					{
						if(Line.charAt(i)=='|')
							count++;
						if(count==4)
							return true;
						System.out.print(Line.charAt(i));
					}
				}
				else
					return false;
			}
			else
				return false;
		}
		
		else if(filePath==DataManipulation.DefendersFILE_PATH
			||	filePath==DataManipulation.FarwardsFILE_PATH
			||	filePath==DataManipulation.GoalkeepersFILE_PATH
			||	filePath==DataManipulation.MidfieldersFILE_PATH) 
		{
			String line;
			FileInputStream file = new FileInputStream(filePath);
			scan = new Scanner(file);
			while(scan.hasNextLine())
			{
				line = scan.nextLine();
				if(line.contains(Key))
				{
					AddPlayerRecord(line);
					return true;
				}
			}
			return false;
		}
		return false;			
	}
	
	public static boolean checkID(String ID) throws FileNotFoundException
	{
		Scanner scan;
		String line;
		FileInputStream file = new FileInputStream(SquadsFILE_PATH);
		scan = new Scanner(file);
		while(scan.hasNextLine())
		{
			line = scan.nextLine();
			if(line.contains(ID))
			{
				scan.close();
				return true;
			}
		}
		scan.close();
		return false;
	}
	
	private static void AddPlayerRecord(String playerRecord) throws IOException
	{
		FileWriter writeToFile = new FileWriter(SquadsFILE_PATH,true);
		writeToFile.write(playerRecord+"\n");
		writeToFile.close();
	}
		
	public static void AddUserID(String UserID) throws IOException
	{
		FileWriter writeToFile = new FileWriter(SquadsFILE_PATH,true);
		writeToFile.write(UserID+"\n");
		writeToFile.close();
	}
	
	public static boolean dataValidation(User newUser) throws FileNotFoundException
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
	
	public static boolean checkUserDatabase(String Email, String passwd) throws FileNotFoundException
	{
		String Check_Line = "";
		
		FileInputStream UsersFile = new FileInputStream(UsersFILE_PATH);
		Scanner scan = new Scanner(UsersFile);
		
		boolean access = false;
		while(scan.hasNextLine())
		{
			Check_Line = scan.nextLine();	
			if(Check_Line.contains(Email))
			{
				System.out.println("Email has been founded");
				if(Check_Line.contains(passwd))
				{
					access = true;
					break;
				}
				else
					break;
			}
		}
		scan.close();
		return access;
	}
	
	public static void addUser(User newUser) throws IOException
	{
		FileWriter writeToFile = new FileWriter(UsersFILE_PATH,true);
		
		writeToFile.write(newUser.getID()+"\t|\t"+newUser.getName()+"\t|\t"+newUser.getFavTeam()
		+"\t|\t"+newUser.getEmail()+"\t|\t"+newUser.getPasswd()+"\n");
		
		System.out.println("New user has been added");
		writeToFile.close();
	}
	
	public static void printUserSquad(String UserID) throws FileNotFoundException
	{
		FileInputStream SquadsFile = new FileInputStream(SquadsFILE_PATH);
		Scanner scan = new Scanner(SquadsFile);
		String line;
		while(scan.hasNextLine())
		{
			line = scan.nextLine();
			if(line.contains(UserID))
			{
				int i = 0;
				while(scan.hasNextLine() && i<15)
				{
					System.out.println(scan.nextLine());
					i++;
				}
				break;
			}
		}
		scan.close();
	}

	public static double calcCost(String UserID) throws FileNotFoundException
	{
		FileInputStream SquadsFile = new FileInputStream(SquadsFILE_PATH);
		Scanner scan = new Scanner(SquadsFile);
		String line;
		double cost = 0.0;
		while(scan.hasNextLine())
		{
			line = scan.nextLine();
			if(line.contains(UserID))
			{
				int i = 0;
				while(scan.hasNextLine() && i<15)
				{
					String Sline = scan.nextLine();
					for(int j=0; j<Sline.length() ;j++)
					{
						if(Sline.charAt(j)=='$')
						{
							cost += Double.parseDouble(Sline.substring(j+1));
							break;
						}
					}
					
					i++;
				}
				break;
			}
		}
		scan.close();
		return cost;
	}
	
	public static void print(String filePath) throws FileNotFoundException
	{	
		Scanner scan;
		
		if(filePath==DataManipulation.UsersFILE_PATH)
		{
			FileInputStream UsersFile = new FileInputStream(filePath);
			scan = new Scanner(UsersFile);
			while(scan.hasNextLine())
			{
				String line = scan.nextLine();
				int c = 0;
				for(int i=0; i<line.length() ;i++)
				{
					if(line.charAt(i)=='|')
						c++;
					if(c==4)
						break;
					System.out.print(line.charAt(i));
				}
				System.out.print("\n");
			}	
		}
		else if(filePath==DataManipulation.DefendersFILE_PATH 
			|| filePath==DataManipulation.FarwardsFILE_PATH
			|| filePath==DataManipulation.GoalkeepersFILE_PATH
			|| filePath==DataManipulation.MidfieldersFILE_PATH
			|| filePath==DataManipulation.SquadsFILE_PATH)
		{
			FileInputStream file = new FileInputStream(filePath);
			scan = new Scanner(file);
			while(scan.hasNextLine())
			{
				String line = scan.nextLine();
				System.out.println(line);
			}
		}
		else
			System.out.println("Invalid file path");
	}	
}
