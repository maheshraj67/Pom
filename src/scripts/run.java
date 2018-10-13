package scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  JUnitCore junit = new JUnitCore();
			  junit.addListener(new TextListener(System.out));
			  Result result = junit.run(ManageIssues.class); // Replace "SampleTest" with the name of your class
			  if (result.getFailureCount() > 0) {
			    System.out.println("Test failed.");
			    System.exit(1);
			  } else {
			    System.out.println("Test finished successfully.");
			    System.exit(0);
			  }
			}
	}


