package package1;

import package1.AcademicInfo;
import package1.PersonalInfo;

public class Student {
	
	private String regNo;
	AcademicInfo acinfo;
	PersonalInfo psinfo;
	
	public Student()
	{
		
	}
	
	public Student(String regNo, PersonalInfo psinfo)
	{
		this.regNo=regNo;
		this.psinfo=psinfo;
	}
	
	public Student(String regNo, AcademicInfo acinfo, PersonalInfo psinfo)
	{
		this.regNo=regNo;
		this.acinfo=acinfo;
		this.psinfo=psinfo;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public AcademicInfo getAcinfo() {
		return acinfo;
	}

	public void setAcinfo(AcademicInfo acinfo) {
		this.acinfo = acinfo;
	}

	public PersonalInfo getPsinfo() {
		return psinfo;
	}

	public void setPsinfo(PersonalInfo psinfo) {
		this.psinfo = psinfo;
	}

}