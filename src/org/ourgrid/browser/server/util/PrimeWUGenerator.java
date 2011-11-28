package org.ourgrid.browser.server.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeWUGenerator {
	static final int RANGE = 1000;
	static final int MAX_VALUE = 1000000;

	public static void main(String[] args) throws IOException {
		
		int wu = 0;
		
		for (int i = 0; i < MAX_VALUE; i+=RANGE) {
			int a = i;
			int b = i + RANGE - 1;
			
			File argsFile = new File("war/jobs/primes/wu-" + wu++);
			argsFile.mkdirs();
			
			FileWriter fileWriter = new FileWriter(argsFile.getAbsolutePath() + "/args.py");
			
			fileWriter.write("arg0=" + a + "\n");
			fileWriter.write("arg1=" + b + "\n");
			
			fileWriter.close();
		}
		
	}
	
}
