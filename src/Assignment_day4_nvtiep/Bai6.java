                                            package Assignment_day4_nvtiep;

import java.io.*;

public class Bai6 {
	public static void main(String[] args) {
		try {
			// File exist\
			
			File apath = new File("E:\\Workspace Oxygen\\tieptv\\src\\Assignment_day4_nvtiep\\a.txt");
			if (apath.exists()) {
				// Open
				BufferedReader input = new BufferedReader(new FileReader("E:\\Workspace Oxygen\\tieptv\\src\\Assignment_day4_nvtiep\\a.txt"));
				BufferedWriter output = new BufferedWriter(new FileWriter("E:\\Workspace Oxygen\\tieptv\\src\\Assignment_day4_nvtiep\\b.txt"));
				String line;
				// Repeat access until end of input
				while ((line = input.readLine()) != null) {
					System.out.println(line);
					output.write(line);
					output.newLine();
				}
				// close
				System.out.println("OK");
				input.close();
				output.close();
			}
		} catch (IOException e) {
			String msg = e.getMessage();
		}
	}
}
