package generic;

public class bulkLocCSVData {
	
	private String locCode;

	private String latitude;

	private String longitude;

	private String nfc;

	private String address;

	private String area;

	private String city;

	private String unitName;

	private String inCharge;



	public bulkLocCSVData(String locCode,String latitude,String longitude, String nfc,String address,String area,String city, String unitName, String inCharge)
	{
        super();
        this.locCode=locCode;
        this.latitude=latitude;
        this.longitude=longitude;
        this.nfc=nfc;
        this.address=address;
        this.area=area;
        this.city=city;
        this.unitName=unitName;
        this.inCharge=inCharge;
	}

	public String getlocCode()
	{
		return locCode;
	}
	
	public String getlatitude()
	{
		return latitude;
	}
	public String getlongitude()
	{
		return longitude;
	}
	public String getnfc()
	{
		return nfc;
	}
	public String getaddress()
	{
		return address;
	}
	public String getarea()
	{
		return area;
	}
	public String getcity()
	{
		return city;
	}
	public String getunitName()
	{
		return unitName;
	}
	public String getinCharge()
	{
		return inCharge;
	}
	
	public String toString() {
		
		        return "bulkLocationUpload [locCode=" + locCode + ", latitude=" + latitude
		
		                + ", longitude=" + longitude + ", nfc=" + nfc + ", address="
		                
		
		                + address + ", area=" +area + ", city=" + city + ", unitName=" + unitName + ", inCharge=" + inCharge + "]";
		
		    }


}
