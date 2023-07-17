package com.citibank.domain;

public class Application {
	
	private Message message;
	
	public Application (Message message) {
		this.message = message;
	}
	
	public void processMessage (String to, String messagetext) {
		message.sendMessage(to, messagetext);
	}
	
//	public void DeliverMessage(int choice, String to, String messageText) {
//		
//		boolean response=false;
//		
//		switch (choice) {
//		case 1:
//			SMSMessage smsMessage = new SMSMessage();
//			response = smsMessage.sendMessage(to, messageText);
//			if (response) {
//				System.out.println("SMS Message sent successfully");
//				System.out.println("To : " + to);
//				System.out.println("Message : " + messageText);
//			}
//			else
//				System.out.println("Error while sending the message");
//			break;
//			
//		case 2:
//			EmailMessage emailMessage = new EmailMessage();
//			response = emailMessage.sendMessage(to, messageText);
//			if (response){
//				System.out.println("Email Message sent successfully");
//				System.out.println("To : " + to);
//				System.out.println("Message : " + messageText);
//			}
//			else
//				System.out.println("Error while sending the message");
//			break;
//			
//		case 3:
//			WhatsappMessage whatsappMessage = new WhatsappMessage();
//			response = whatsappMessage.sendMessage(to, messageText);
//			if (response){
//				System.out.println("Whatspp Message sent successfully");
//				System.out.println("To : " + to);
//				System.out.println("Message : " + messageText);
//			}
//			else
//				System.out.println("Error while sending the message");
//			break;
//
//		default:
//			System.out.println("Enter Correct Choice");
//			break;
//		}
//		
//	}

}
