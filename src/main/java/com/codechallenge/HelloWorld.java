package com.codechallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.StringBuilder;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
		File file = new File("titanic_script.txt");
		try {
			StringBuilder x = new StringBuilder();
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				x.append(scanner.nextLine());
			}
			int arr[] = new int[11];
			arr[0]=x.lastIndexOf("H");
			arr[1]=x.lastIndexOf("e");
			arr[2]=x.lastIndexOf("l");
			arr[3]=x.lastIndexOf("l");
			arr[4]=x.lastIndexOf("o");
			arr[5]=x.lastIndexOf(" ");
			arr[6]=x.lastIndexOf("W");
			arr[7]=x.lastIndexOf("o");
			arr[8]=x.lastIndexOf("r");
			arr[9]=x.lastIndexOf("l");
			arr[10]=x.lastIndexOf("d");
			for(int i=0; i<arr.length; i++){
				System.out.print(x.charAt(arr[i]));
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//System.out.println("Hello World");
	}
}
