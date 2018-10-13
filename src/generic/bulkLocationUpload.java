package generic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;


public class bulkLocationUpload implements Auto_const {
	
	
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	    
	static String s = RandomStringUtils.randomAlphabetic(8);
	static String s1 = RandomStringUtils.randomAlphabetic(8);
		
	private static final String FILE_HEADER ="locCode,latitude,longitude,nfc,address,area,city,unitName,inCharge";
	
	 public static void writeCsvFile()
	 {
		 bulkLocCSVData ex1= new bulkLocCSVData(s, "12.722", "72.88","nfc tag name","address","area","city","unit","incharge");
		 bulkLocCSVData ex2= new bulkLocCSVData(s1, "12.722", "72.88","nfc tag name","address","area","city","unit","incharge");
	
		 List<bulkLocCSVData> ex= new ArrayList();
	
		 ex.add(ex1);
		 ex.add(ex2);
	
		 FileWriter fileWriter = null;
		 	                  
		 
		 try {
		 
		      fileWriter = new FileWriter(PATH);
		 
		      //Write the CSV file header
		 
		      fileWriter.append(FILE_HEADER.toString());
		
		      //Add a new line separator after the header
		 
		      fileWriter.append(NEW_LINE_SEPARATOR);
		 
		      //Write a new student object list to the CSV file
		 
		      for (bulkLocCSVData v:ex) 
		      {
		    	  fileWriter.append(String.valueOf(v.getlocCode()));
		 
		          fileWriter.append(COMMA_DELIMITER);
		 
		          fileWriter.append(v.getlatitude());
		 
		          fileWriter.append(COMMA_DELIMITER);
		 
		          fileWriter.append(v.getlongitude());
		 
		          fileWriter.append(COMMA_DELIMITER);
		 
		          fileWriter.append(v.getnfc());
		 
		          fileWriter.append(COMMA_DELIMITER);
		 
		          fileWriter.append(String.valueOf(v.getaddress()));
		 
		          fileWriter.append(COMMA_DELIMITER);
		                 
		          fileWriter.append(String.valueOf(v.getarea()));
		        		 
		          fileWriter.append(COMMA_DELIMITER);
		                 
		          fileWriter.append(String.valueOf(v.getcity()));
		        		 
		          fileWriter.append(COMMA_DELIMITER);
		                 
		          fileWriter.append(String.valueOf(v.getunitName()));
		        		 
		          fileWriter.append(COMMA_DELIMITER);
		                 
		          fileWriter.append(String.valueOf(v.getinCharge()));
		        		 
		          fileWriter.append(NEW_LINE_SEPARATOR);
		 
		      }
		             
		       System.out.println("CSV file was created successfully !!!");
		                             
		       } catch (Exception e){
		             
		    	   System.out.println("Error in CsvFileWriter !!!");
		             
		           e.printStackTrace();
		             
		       }
		 
		 		finally {
		             
		                          
		            try {
		             
		                 fileWriter.flush();
		             
		                 fileWriter.close();
		             
		                 } catch (IOException e) {
		             
		                	 System.out.println("Error while flushing/closing fileWriter !!!");
		             
		                      e.printStackTrace();
		             
		                  }

		  
		                 }
	 }

	
}