package Hospital;

import java.util.Scanner;

import Hospital.Admin.*;


public class Hospital {
	
	public static void main(String[] args){
		
		int choice=0;
		
		Scanner sc = new Scanner(System.in);
		LogIn login = new LogIn();
                Exception1 e=new Exception1();
		String usrname,password;
		do
		{
			
			System.out.println("Welcome to Citius Hospital");
			System.out.println("Press 1 for Admin Login");
			System.out.println("Press 2 for Patient Login");
			System.out.println("Press 3 for Doctor Login");
			System.out.println("Press 4 for Pharmasist Login");
			System.out.println("Press 5 for Guest Login");
			System.out.println("Press 6 to exit the system");
			choice = sc.nextInt();
			usrname=null;
			password=null;
			if(choice<5 && choice>0){
			
			System.out.println("Enter Id: ");
			usrname=sc.next().toLowerCase();
			System.out.println("Enter password: ");
			password=sc.next();
			}
			switch(choice)
			{
				
			case 1:
			{
				if(login.adminLogin(usrname,password))
				{
					AdminOps.adminoperations();
				}
				else
				{
					e.inValidDetails();
				}
				break;
			}
			case 2:
			{
				if(login.userLogin(usrname,password))
				{
					UserOps.useroperations();
				}else
				{
					e.inValidDetails();
				}
				break;
			}
			case 3:
			{
				if(login.doctorLogin(usrname,password))
				{
					DoctorOps.doctoroperations();
				}
				else
				{
					e.inValidDetails();
				}
				break;
			}
			case 4:
			{
				if(login.pharmasistLogin(usrname,password))
				{
					PharmasistOps.pharmasistoperations();
				}
				else
				{
					e.inValidDetails();
				}
				break;
			}
			case 5:
			{
				login.guestLogin();
				break;
			}
			case 6:
				System.out.println("You will now be exiting the system...");
				break;
				
			default:
				e.inValidOption();
				
			
			}
			
			
		}while(choice!=6);
		
		sc.close();
	}

}
