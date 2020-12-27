package fpackage;

public class person {
	
	protected String name;
	protected int age;
	
	public person() {
		name = "";
		age = 1;
	}
	
	public person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
