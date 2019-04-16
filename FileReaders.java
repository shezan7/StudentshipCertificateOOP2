package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReaders {

	public ArrayList <PersonalInfo> ArrPer = new ArrayList <PersonalInfo>();
	public ArrayList <AcademicInfo> ArrAcc = new ArrayList <AcademicInfo>();
	public ArrayList <Student> ArrStu = new ArrayList <Student>();
	
	public FileReaders()
	{
		
	}
	
	public void readfilePersonal()
	{	
		try
		{
			File ifile = new File("C:\\Users\\Shezan Al Mahmud\\Desktop\\shezan1023/Personal.txt");
			FileReader fr = new FileReader(ifile);
			BufferedReader br = new BufferedReader(fr);
			
			String [] SSI = new String [6];
			
			String s1;
			while((s1=br.readLine())!=null)
			{
				SSI = s1.split(",");
				
				PersonalInfo pic = new PersonalInfo(SSI[0],SSI[1],SSI[2],SSI[3],SSI[4],SSI[5]);
				
				Student student = new Student(SSI[5],pic);
				
				ArrPer.add(pic);
				
				ArrStu.add(student);
			}
			
			br.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void readfileAcademic()
	{
		try
		{
			File ifile = new File("C:\\Users\\Shezan Al Mahmud\\Desktop\\shezan1023/Academic.txt");
			FileReader fr = new FileReader(ifile);
			BufferedReader br = new BufferedReader(fr);
			
			String [] SSI = new String [6]; 
			
			String s1;
			while((s1=br.readLine())!=null)
			{
				SSI = s1.split(",");

				AcademicInfo aic = new AcademicInfo(SSI[0],SSI[1],SSI[2],SSI[3],SSI[4],SSI[5]);
				
				ArrAcc.add(aic);
				
				for(int i=0; i<ArrStu.size(); i++)
				{
					if(ArrStu.get(i).getRegNo().equals(SSI[0]))
					{
						ArrStu.get(i).setAcinfo(aic);
					}
				}
				
			}
			
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
