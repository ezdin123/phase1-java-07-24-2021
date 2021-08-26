package com.simplilearn.arrays;

import java.util.Scanner;

public class PingSystem {

	public static void main(String[] args) {
		// TODO :: A range Ip addresses you should ping and validate
				// String[] ipAddresses = { "192.168.0.1","", };  => sysout("ping " +ipAddresses[index]);
				// Ask user to replace a ip address with ip		
		String[] ipAddresses = { "192.168.0.12","192.168.0.13","192.168.0.14" ,"192.168.0.15", "192.168.0.16"};
		/*for (int index = 0; index < ipAddresses.length; index++) {
			System.out.println("Ping => :  "  + index + "  value   :  "+ ipAddresses[index]);
			
		}*/
		// step 1. collect input from user console
				Scanner input = new Scanner(System.in);
				System.out.println("-----------------------------------------");
				System.out.println(" :: Welcome to show balance feature of Bank ABC :: ");
				System.out.println("-----------------------------------------");
			
				 
					System.out.println(" :: Enter a ipaddress :: ");
				String ipaddress = input.next();
				updateIpAddress( ipAddresses,  ipaddress);
		
	

	}
	private static void updateIpAddress( String[] ipAddresses,  String ipaddress) {
		for (int index = 0; index < ipAddresses.length; index++) {
		//System.out.println("Ping => :  "  + index + "  value   :  "+ ipAddresses[index]);
		if(ipAddresses[index] == ipaddress) {
			System.out.println("User is Found with userId : " + ipaddress);
			System.out.println("The Account username : " + ipAddresses[index]);
		}
		
	}
		
		
		
	}

}
