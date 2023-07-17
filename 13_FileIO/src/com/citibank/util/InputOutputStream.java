package com.citibank.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStream {
	private InputStream inputStream;
	private OutputStream outputStream;
	private byte[] data;
	private int size;

	public String readFile(File file) {
		try {
			inputStream = new FileInputStream(file);
			size = (int) file.length();
			data = new byte[size];
			inputStream.read(data);
			String tempData = new String(data);
			return tempData;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean writeFile(File file, String data) {
		try {
			outputStream = new FileOutputStream(file,true);
			data = "\n" + data;
			this.data = data.getBytes();
			outputStream.write(this.data);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
