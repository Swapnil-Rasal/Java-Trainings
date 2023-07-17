package com.citibank.util;

import java.io.File;
import java.util.Scanner;

public class ReadWriteFileData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String copyPath;
		String pastePath= "";
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter path of a file to copy its contents");
		copyPath = scanner.nextLine();
		
		File file = new File(copyPath);
		
		
		System.out.println("Enter path/Directory where you want to paste the file");
		pastePath = scanner.nextLine();
		
		File file2 = new File(pastePath +"/copy.txt");
		ReadFileData readFileData = new ReadFileData();
		WriteFileData writeFileData = new WriteFileData();
		
		String data = readFileData.readData(file);
		
		result = writeFileData.writeData(file2, data);
		
		if (result) {
			System.out.println("Write Successful.. Please Check your file");
		}
		else {
			System.out.println("Write operation failed !");
		}	

	}

}
