package countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException{
		Path fileName = Path.of("D:\\247637\\tincv4\\soubor.txt");
		
		String str = Files.readString(fileName);
		
		System.out.println(str);
		
		String[] words = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String string : words) {
			if (map.containsKey(string)) {
				int value = map.get(string);
				map.put(string, value+1);
			} else {
				map.put(string, 1);
			}
		}
		
		map.forEach((key, value) ->{
			System.out.println(key + ";" + value);
		});
	}
}
