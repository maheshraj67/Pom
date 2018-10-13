package generic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;


public class bulkUserUpload implements Auto_const {


	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	static String username1 = RandomStringUtils.randomAlphabetic(8);
	static String username2 = RandomStringUtils.randomAlphabetic(8);
	static String username3 = RandomStringUtils.randomAlphabetic(8);

	static Random random = new Random();
	static String randomNum1 = random.toString();
	static String randomNum2 = random.toString();
	static String randomNum3 = random.toString();
	
	static Random rand = new Random();
	static long rand_long1 = rand.nextLong();
	static long rand_long2 = rand.nextLong();
	static long rand_long3 = rand.nextLong();
	
	
	

	//static String value= "\"clientviewer,clientadmin\"";
//	static String value1="\"clientviewer,fielduser\"";

	

	private static final String FILE_HEADER ="firstname,lastname,email,country-code(with out '+' sign or '00'),phone,username,password,pin";

	public static void writeCsvFile()
	{
		bulkUserCSVData ex1= new bulkUserCSVData(username1, "l",username1 + "@example.com","91",rand_long1,username1,"pwd#user1", "");
		bulkUserCSVData ex2= new bulkUserCSVData(username2, "l",username2 + "@example.com","91",rand_long2,username2," ","7893");
		bulkUserCSVData ex3= new bulkUserCSVData(username3, "l",username3 + "@example.com","92",rand_long3,username3,"pwd#user3","1234");

		List<bulkUserCSVData> ex= new ArrayList();

		ex.add(ex1);
		ex.add(ex2);
		ex.add(ex3);

		FileWriter fileWriter = null;


		try {

			fileWriter = new FileWriter(UserPATH);

			//Write the CSV file header

			fileWriter.append(FILE_HEADER.toString());

			//Add a new line separator after the header

			fileWriter.append(NEW_LINE_SEPARATOR);

			//Write a new student object list to the CSV file

			for (bulkUserCSVData v:ex) 
			{
				fileWriter.append(String.valueOf(v.getfirstname()));

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(v.getlastname());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(v.getemail());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(v.getcountryCode());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(String.valueOf(v.getphone()));

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(String.valueOf(v.getusername()));

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(String.valueOf(v.getpassword()));

				fileWriter.append(COMMA_DELIMITER);

				//fileWriter.append(String.valueOf(v.getusertype()));


				//fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(String.valueOf(v.getpin()));

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