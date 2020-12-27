package fpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class User extends person {
	
	Scanner sc;
	
	private String email;
	private String passwd;
	private String favTeam;
	private String ID;
	private double budget;
	private Squad newSquad = new Squad();
	
	
	public User() {
		super();
		email="";
		passwd="";
		favTeam = "";
		setBudget(100.0);
		setID();
	}
	
	public User(String name, int age, String email, String passwd , String favTeam) {
		super(name , age);
		this.email = email;
		this.passwd = passwd;
		this.favTeam = favTeam;
		setBudget(100.0);
		setID();
	}
	
	public void printSquadPlayers() throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		String UserID = scan.nextLine();
		DataManipulation.printUserSquad(UserID);
		scan.close();
	}

	public double NewBudget() throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		String ID = scan.nextLine();
		setBudget(getBudget() - DataManipulation.calcCost(ID));
		scan.close();
		return getBudget();
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
	
	public void AddSquad() throws IOException
	{
		String Name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		String ID = sc.nextLine();
		if(!DataManipulation.checkID(ID))
		{
			DataManipulation.AddUserID(ID);
			System.out.println("Defenders");
			for(int i = 0; i<5 ;i++)
			{
				System.out.println("Enter name for defender player #"+(i+1));
				Name = sc.nextLine();
				if(DataManipulation.search(Name, DataManipulation.DefendersFILE_PATH))
					System.out.println("Player record has been added");
				else
				{
					System.out.println("Player name does not exist!");
					System.out.println("Try again");
					--i;
				}
			}
			
			System.out.println("Midfielders");
			for(int i = 0; i<5 ;i++)
			{
				System.out.println("Enter name for midfielder player #"+(i+1));
				Name = sc.nextLine();
				if(DataManipulation.search(Name, DataManipulation.MidfieldersFILE_PATH))
					System.out.println("Player record has been added");
				else
				{
					System.out.println("Player name does not exist!");
					System.out.println("Try again");
					--i;
				}
			}
			
			System.out.println("Forwards");
			for(int i = 0; i<3 ;i++)
			{
				System.out.println("Enter name for farward player #"+(i+1));
				Name = sc.nextLine();
				if(DataManipulation.search(Name, DataManipulation.FarwardsFILE_PATH))
					System.out.println("Player record has been added");
				else
				{
					System.out.println("Player name does not exist!");
					System.out.println("Try again");
					--i;
				}
			}
			
			System.out.println("Goalkeepers");
			for(int i = 0; i<2 ;i++)
			{
				System.out.println("Enter name for goalkeeper #"+(i+1));
				Name = sc.nextLine();
				if(DataManipulation.search(Name, DataManipulation.GoalkeepersFILE_PATH))
					System.out.println("Player record has been added");
				else
				{
					System.out.println("Player name does not exist!");
					System.out.println("Try again");
					--i;
				}
			}
			sc.close();
			System.out.println("Squad has been created!");
		}
		else
			System.out.println("Entered ID already exist..");
	}
	
	public boolean logIn() throws FileNotFoundException
	{
		return registeration.Login();
	}
	
	public boolean signUp() throws IOException
	{
		return registeration.SignUP();
	}
	
	public void printSquadInfo()
	{
		for(int i=0; i<newSquad.getNumOfPlayersInSquad() ;i++)
			System.out.println(newSquad.squad.get(i).getName()
			+"\t"+newSquad.squad.get(i).getAge()
			+"\t"+newSquad.squad.get(i).getNationality()
			+"\t"+newSquad.squad.get(i).getTeam()
			+"\t"+newSquad.squad.get(i).getPosition()
			+"\t"+newSquad.squad.get(i).getPoints()
			+"\t"+newSquad.squad.get(i).getCost()
			+"\t"+newSquad.squad.get(i).getPoints());
	}
	
	private void setID()
	{
		ID = "UID"+Integer.toString(LineNumberCounter.LineCounter()+1);
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
