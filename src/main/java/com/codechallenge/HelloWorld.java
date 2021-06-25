package com.codechallenge;

import java.util.ArrayList;
import java.util.*;
import java.io.*;


/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
		Duck duck = new Duck();
		String quack = duck.getDuckQuack();
		System.out.println(quack);
		duck.readFile();
	}


}

class Duck{

	Duck(){

	}

	public static String getDuckH(){
		return "H";
	}

	public static String getDuckE(){
		return "e";
	}

	public String getDuckL(){
		return "l";
	}

	public String getDuckL2(){
		return "l";
	}

	public String getDuckO(){
		return "o";
	}

	public String getDuckW(){
		return "W";
	}

	public String getDuckO2(){
		return "o";
	}

	public String getDuckR(){
		return "r";
	}

	public String getDuckL3(){
		return "l";
	}

	public String getDuckD(){
		return "d";
	}

	public String getDuckSpace(){
		return " ";
	}

	public String getDuckQuack(){
		return getDuckHello() + getDuckSpace() + getDuckWorld();
	}

	public String getDuckHello(){
		return getDuckH() + getDuckE() + getDuckL() + getDuckL2() + getDuckO();
	}

	public String getDuckWorld(){
		return getDuckW() + getDuckO2() + getDuckR() + getDuckL3() + getDuckD();
	}

	public static String readFile(){
		try {
			String combinedSong = new String();
			File myObj = new File(".\\DuckSong.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				combinedSong += data;
			}
			myReader.close();
			char tempArray[] = combinedSong.toCharArray();

			// sort tempArray
			Arrays.sort(tempArray);
			return Arrays.toString(tempArray);
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return null;
	}

	public String sortArray(){
		String duckSong = this.readFile();
		return duckSong;
	}
}

//read a file
//insertion sort
//find single occurence of letter
