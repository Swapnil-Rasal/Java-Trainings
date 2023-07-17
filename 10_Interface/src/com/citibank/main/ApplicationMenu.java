package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Application;
import com.citibank.domain.EmailMessage;
import com.citibank.domain.Message;
import com.citibank.domain.SMSMessage;
import com.citibank.domain.WhatsappMessage;

public class ApplicationMenu {

	public static void main(String[] args) {
		Message message = null;
		boolean response=false;
		int choice;
		String to;
		String messageText;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------> Menu <-------");
		System.out.println("1. SMS Message ");
		System.out.println("2. Email Message ");
		System.out.println("3. Whatsapp Message");
		System.out.println("Enter you choice -");
		
		choice = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("To whome you want to send a Message");
		to = scanner.nextLine();
		
		System.out.println("Please enter a message text");
		messageText = scanner.nextLine();
		
		switch (choice) {
		case 1:
			message = new SMSMessage();
			response = message.sendMessage(to, messageText);
			if (response) {
				System.out.println("SMS Message sent successfully");
				System.out.println("To : " + to);
				System.out.println("Message : " + messageText);
			}
			else
				System.out.println("Error while sending the message");
			break;
			
		case 2:
			message= new EmailMessage();
			response = message.sendMessage(to, messageText);
			if (response){
				System.out.println("Email Message sent successfully");
				System.out.println("To : " + to);
				System.out.println("Message : " + messageText);
			}
			else
				System.out.println("Error while sending the message");
			break;
			
		case 3:
			message = new WhatsappMessage();
			response = message.sendMessage(to, messageText);
			if (response){
				System.out.println("Whatspp Message sent successfully");
				System.out.println("To : " + to);
				System.out.println("Message : " + messageText);
			}
			else
				System.out.println("Error while sending the message");
			break;

		default:
			System.out.println("Enter Correct Choice");
			break;
		}

		
	//	Application application = new Application();
	//	application.DeliverMessage(choice, to, messageText);
				
		
		

	}

}
