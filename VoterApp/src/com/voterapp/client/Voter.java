package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class Voter {

	public static void main(String[] args) {
 System.out.println("welcome to the electronicbooth");
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the age");
 int age=sc.nextInt();
 System.out.println("enter the locality");
 String locality=sc.next();
 System.out.println("enter the voterid four digit number");
 int cardnumber=sc.nextInt();
 IElectionBooth electronicbooth=new ElectionBoothImpl();
 try {
	 boolean check=electronicbooth.checkEligibility(age,locality,cardnumber);
	 if(check)
	 {
		 System.out.println("you are eligible");
	 }
	 else System.out.println("doubtful voter");
			 
 }
 catch(Exception e) {
	 System.out.println(e.getMessage());
 }
	}

}
