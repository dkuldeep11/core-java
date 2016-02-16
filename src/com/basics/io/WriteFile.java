package com.basics.io;

import java.io.*;

public class WriteFile {

	File f;
	FileOutputStream fs;
	String data;

	WriteFile() {
		try {
			f = new File("data/file_WriteFile.dat");
			if (!f.exists()) {
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
		try {
			fs = new FileOutputStream(f);
			byte[] arr = data.getBytes();
			fs.write(arr);
			fs.flush();
			System.out.println("File Written Successfully");
		} catch (IOException e) {
			System.out.println("stream exception");
			e.printStackTrace();
		} finally {
			try {
				fs.close();
			} catch (IOException e) {
				System.out.println("Err closing the stream");
				e.printStackTrace();
			}
		}
	}

	void WriteUsingBufferedWriter() {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write("This is using WriteUsingBufferedWriter");
			System.out.println("Writing successful");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	//append to a file using bufferedwriter
	void AppendUsingBufferedWriter() {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(f, true);
			bw = new BufferedWriter(fw);
			bw.write("This is using WriteUsingBufferedWriter");
			System.out.println("Appended successful");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//append to a file using printdwriter
		void AppendUsingPrintWriter() {

			FileWriter fw = null;
			BufferedWriter bw = null;
			PrintWriter pw = null;
			try {
				fw = new FileWriter(f, true);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);
				pw.println();
				pw.println("This is 1st line");
				pw.println("This is 2nd line");
				pw.println("This is 3rd line");
				System.out.println("Appended successful");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (bw != null) {
						bw.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteFile o1 = new WriteFile();
		o1.WriteUsingFileOutputStream();
		o1.WriteUsingBufferedWriter();
		o1.AppendUsingBufferedWriter();
		o1.AppendUsingPrintWriter();

	}

}
