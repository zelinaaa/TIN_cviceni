package tincv1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
		try {
		      File myObj = new File("text.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        countSlova(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
	
	public static void countSlova(String veta) {
		String[] splitted = veta.split("[,|\\.|\\ ]+");
		
		for (String slovo : splitted) {
			System.out.println(slovo);
		}
	}

}
