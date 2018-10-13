package generic;

public class bulkUserCSVData {
	
	private String firstname;

	private String lastname;

	private String email;

	private String countryCode;

	private long phone;

	private String username;

	private String password;

	//private String usertype;

	private String pin;



	public bulkUserCSVData(String firstname,String lastname,String email, String countryCode,long rand_long1,String username,String password,String pin)
	{
        super();
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.countryCode=countryCode;
        this.phone=rand_long1;
        this.username=username;
        this.password=password;
        //this.usertype=usertype;
        this.pin=pin;
	}

	public String getfirstname()
	{
		return firstname;
	}
	
	public String getlastname()
	{
		return lastname;
	}
	public String getemail()
	{
		return email;
	}
	public String getcountryCode()
	{
		return countryCode;
	}
	public long getphone()
	{
		return phone;
	}
	public String getusername()
	{
		return username;
	}
	public String getpassword()
	{
		return password;
	}
//	public String getusertype()
//	{
//		return usertype;
//	}
	public String getpin()
	{
		return pin;
	}
	
	public String toString() {
		
		        return "bulkUserUpload [firstname=" + firstname + ", lastname=" + lastname
		
		                + ", email=" + email + ", countryCode=" + countryCode + ", phone="
		                
		
		                + phone + ", username=" +username + ", password=" + password + ",  pin=" + pin + "]";
		
		    }


}
