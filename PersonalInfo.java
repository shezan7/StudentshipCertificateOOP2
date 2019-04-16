package package1;

public class PersonalInfo{

	private String name;
	private String fathersName;
	private String mothersName;
	private String dateOfBirth;
	private String homeTown;
	private String regNo;
	
	public PersonalInfo()
	{
		
	}
	
	public PersonalInfo(String name,String FN,String MN,String DOB,String hometown,String regNo)
	{
		this.name=name;
		this.fathersName=FN;
		this.mothersName=MN;
		this.dateOfBirth=DOB;
		this.homeTown=hometown;
		this.regNo=regNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFN() {
		return fathersName;
	}
	public void setFN(String fN) {
		fathersName = fN;
	}
	public String getMN() {
		return mothersName;
	}
	public void setMN(String mN) {
		mothersName = mN;
	}
	public String getDOB() {
		return dateOfBirth;
	}
	public void setDOB(String dOB) {
		dateOfBirth = dOB;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getRegNo() {
		return regNo;
	}

}
