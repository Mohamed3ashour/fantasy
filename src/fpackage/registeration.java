package fpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class registeration {
	
	public static boolean Login() throws FileNotFoundException
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your email: ");
		String Uemail = sc.nextLine();
		System.out.print("Enter your Password: ");
		String Upasswd = sc.nextLine();
		sc.close();
		if(DataManipulation.checkUserDatabase(Uemail, Upasswd))
		{
			System.out.println("Access successfully..!");
			return true;
		}
		else
		{
			System.out.println("Invalid Email or Password..!");
			return false;
		}
	}
	
	public static boolean SignUP() throws IOException
	{
		User temp = new User();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		temp.setName(scan.nextLine());
		
		System.out.print("Enter your email : ");
		temp.setEmail(scan.nextLine());
		
		System.out.print("Enter your password : ");
		temp.setPasswd(scan.nextLine());
		
		System.out.print("Enter your favourite premier league team : ");
		temp.setFavTeam(scan.nextLine());
		
		if(DataManipulation.dataValidation(temp))
		{
			DataManipulation.addUser(temp);
			scan.close();
			return true;
		}
		else
		{
			System.out.println("Invalid data ..");
			scan.close();
			return false;
		}
	}	
}

