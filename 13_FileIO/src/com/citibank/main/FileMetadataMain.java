package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.FileMetadata;

public class FileMetadataMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		
		System.out.println("Enter file/directory path to print metadata");
		path = scanner.nextLine();
		
		File file = new File(path);
		
		FileMetadata fileMetadata = new FileMetadata();
		fileMetadata.printMetadata(file);
		scanner.close();
	}

}
