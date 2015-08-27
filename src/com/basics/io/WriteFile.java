package com.basics.io;

import java.io.*;

public class WriteFile {

	File f;
	FileOutputStream fs;
	String data;

	WriteFile() {
		try {
			f = new File("data/file_WriteFile.dat");
			if (!f.exists()){
				f.createNewFile();
			}
			data = "This is sample data to be written";
		} catch (Exception e) {
			System.out.println("File cannot be crated");
			e.printStackTrace();
		}
	}

	// FileOutputStream: writes to a file using bytes array
	void WriteUsingFileOutputStream() {
		try{
		fs = new FileOutputStream(f);
		byte[] arr = data.getBytes();
		fs.write(arr);
		fs.flush();
		System.out.println("File Written Successfully");
		}
		catch(IOException e){
			System.out.println("stream exception");
			e.printStackTrace();
		}
		finally{
			try{
					fs.close();
			}
			catch(IOException e){
				System.out.println("Err closing the stream");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteFile o1 = new WriteFile();
		o1.WriteUsingFileOutputStream();
		
	}

}
