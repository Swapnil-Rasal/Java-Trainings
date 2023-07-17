package com.citibank.main;

import java.util.Scanner;

import com.citibank.repository.LoginRepository;

public class LoginMain {

	public static void main(String[] args) {
		String loginId;
		String password;
		String username;
		String login = "";
		Scanner scanner = new Scanner(System.in);
		LoginRepository loginRepository = new LoginRepository();

		do {
			System.out.println("******** WELCOME TO LOGIN SCREEN ******** ");
			System.out.println("------------------------------------------");
			System.out.println("PLEASE ENTER YOUR LOGIN DETAILS : ");
			System.out.println("LOGIN ID : ");
			loginId = scanner.next();
			System.out.println("PASSWORD : ");
			password = scanner.next();

			username = loginRepository.getLoginDetails(loginId, password);

			if (username != null) {
				if (username == "max") {
					System.out.println("You have exceeded maximum incorrect login attempts!!");
					login = "failed";
					System.exit(0);
				} else {
					System.out.println("Login Succussfull!! Welcome " + username);
					login = "success";
					break;
				}
			} else {
				System.out.println("Login Failed, Please Try again with correct LOGIN ID and PASSSWORD");
				login = "failed";	
			}

		} while (login == "failed");

	}

}
