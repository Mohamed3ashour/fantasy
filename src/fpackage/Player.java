package fpackage;

public class Player extends person {
	
	private String team;
	private int points;
	private double cost;
	private String position;
	private String nationality;
	
	public Player() {
		super();
		team = "";
		points = 0;
		cost = 0.0;
		position = "";
		nationality = "";
	}
	
	public Player(String name, int age, String team, int points, double cost, String position) {
		super(name,age);
		this.team = team;
		this.points = points;
		this.cost = cost;
		this.position = position;
		nationality = "";
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
	
}
