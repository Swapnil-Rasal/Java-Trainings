package com.citibank.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileData {
	private Writer writer;
	
	public boolean writeData(File file, String data) {
		try {
			writer = new FileWriter(file);
			writer.write("\n");
			writer.write(data);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		
	}

}
