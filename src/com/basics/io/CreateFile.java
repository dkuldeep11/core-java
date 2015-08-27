package com.basics.io;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("data/testfile.dat");
			boolean b = f.createNewFile();
			
			if (b){
				System.out.println("File created!");
			}
			else {
				System.out.println("Already exists");
			}
		
		}
		catch (IOException e){
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		
	}

}
