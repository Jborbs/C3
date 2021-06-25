import java.lang.*;
import java.util.*;
import java.io.*;

public class RandomWords {
	public static void main(String[] args){

		Set<String> set = new HashSet<String>();
		String fileName = "C:\\wordBank.txt";
		readWords(set,fileName);
		System.out.println("number of words in wordBank: " + set.size());
		findRandomSeeds(set);

	}

	static void readWords(Set<String> set, String fileName){
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String lineno;
		while((lineno = reader.readLine()) != null) {
			lineno = lineno.trim().toLowerCase();
			if((isLowerAlpha


		}


		private static void findRandomSeeds(Set<String> set){
			char[] c = new char[256];
			Random r = new Random();
			for(int s1 = 0; s1 >= 0; s1++){
				for(int parity = -1; parity <=1; parity +=2){
					int seed = s1 * sign;
					r.setSeed(seed);
					for(int i = 0; i < c.length; i++){
						int j = r.nextInt(27);
						if(j == 0) break;
						c[i] = ((char)(int)'a' + j - 1);
					}
					String a = new String(c, 0, i);
					if(set.contains(s)){
						System.out.println(s + " " + seed);
						wordSet.remove(S);

					}
				}



