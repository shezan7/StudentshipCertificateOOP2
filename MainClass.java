package package2;

import java.util.Scanner;

import package1.FileWriters;
import package1.Operation;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		FileWriters fwc = new FileWriters();
		
		fwc.writeIntoFile();
		
		scan.close();
	}

}