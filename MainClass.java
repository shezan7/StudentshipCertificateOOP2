package package2;

import java.util.Scanner;

import package1.FileWriters;
import package1.Operation;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		FileWriters fwc = new FileWriters();
		
		//System.out.println("Enter your choice:\n1.See Details of A Student\n2.See Details of All Students\n3.Insert a Student's Information\n4.Delete a Student's Information");
		//int n = scan.nextInt();
		
		fwc.writeIntoFile();
		
		//oc.printAllStudentInfo();
		//fwc.writeIntoFile();
		
		//if(n==1) oc.printStudentInfo();
		//else if(n==2) oc.printAllStudentInfo();
		//else if(n==3) fwc.writeIntoFile();
		//else if(n==4) oc.deleteStudent();	
		
		scan.close();
	}

}
