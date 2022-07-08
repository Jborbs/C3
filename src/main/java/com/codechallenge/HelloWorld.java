package com.codechallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Stream;
//import unnecessary packages here


public class HelloWorld {

	public static void main(String[] args) throws Exception{
		//Rename all variables to shit names
		File file = new File("src\\pirates.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		ArrayList<String> allPiratesWords = new ArrayList<String>();
		int integerPlaceholder = 0;
		while((st = br.readLine()) != null)
		{
			String[] splitValues;
			splitValues = st.split(" ");

			for(int i = 0; i < splitValues.length; i++) {
				allPiratesWords.add(splitValues[i]);
			}



		}

		allPiratesWords.sort(String::compareTo);
		allPiratesWords.forEach(s ->
		{
			if(s.equals("Hello")) {
				System.out.print("Hello");
			};
			if(s.equals("World")) {
				System.out.print("World");
			};
		});
		System.out.println("Hello World");
	}

//	// Java Program to implement BogoSort
//	public class BogoSort {
//		// Sorts array a[0..n-1] using Bogo sort
//		void bogoSort(int[] a)
//		{
//			// if array is not sorted then shuffle the
//			// array again
//			while (isSorted(a) == false)
//				shuffle(a);
//		}
//
//		// To generate permutation of the array
//		void shuffle(int[] a)
//		{
//			// Math.random() returns a double positive
//			// value, greater than or equal to 0.0 and
//			// less than 1.0.
//			for (int i = 0; i < a.length; i++)
//				swap(a, i, (int)(Math.random() * i));
//		}
//
//		// Swapping 2 elements
//		void swap(int[] a, int i, int j)
//		{
//			int temp = a[i];
//			a[i] = a[j];
//			a[j] = temp;
//		}
//
//		// To check if array is sorted or not
//		boolean isSorted(int[] a)
//		{
//			for (int i = 1; i < a.length; i++)
//				if (a[i] < a[i - 1])
//					return false;
//			return true;
//		}
//
//		// Prints the array
//		void printArray(int[] arr)
//		{
//			for (int i = 0; i < arr.length; i++)
//				System.out.print(arr[i] + " ");
//			System.out.println();
//		}
//
//		public static void main(String[] args)
//		{
//			// Enter array to be sorted here
//			int[] a = { 3, 2, 5, 1, 0, 4 };
//			BogoSort ob = new BogoSort();
//
//			ob.bogoSort(a);
//
//			System.out.print("Sorted array: ");
//			ob.printArray(a);
//		}
//	}
}
