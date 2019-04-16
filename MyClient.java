package basicPackage;

import java.net.*;  
import java.io.*;

public class MyClient {
	
	public static void main(String args[])throws Exception{ 
		System.out.println("Welcome to client. Write stop for close");
		
		Socket s=new Socket("10.100.101.28",30333);  
		
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="",str2="";  
		while(!str.equals("stop")){  
			str=br.readLine();  
			dout.writeUTF(str);  
			dout.flush();  
			str2=din.readUTF();  
			System.out.println("Server says: "+str2);  
		}  
		  
		dout.close();  
		s.close();  
		
		System.out.println("Thank you.");

		}

}
