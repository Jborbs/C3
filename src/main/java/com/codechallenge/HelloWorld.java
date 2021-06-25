package com.codechallenge;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
void bogoSort(int[] a) {while (isSorted(a) == false)shuffle(a);}void shuffle(int[] a){
		for (int i = 0; i < a.length; i++)
			swap(a, i, (int)(Math.random() * i));
	}void swap(int[] a, int i, int j){ int temp = a[i];
		a[i] = a[j];a[j] = temp;
}
	boolean isSorted(int[] a)
	{for (int i = 1; i < a.length; i++) if (a[i] < a[i - 1]) return false; return true; }
void printArray(int[] arr)
	{for (int i = 0; i < arr.length; i++)System.out.print(arr[i] + " ");System.out.println();
	}public static void main(String[] args)
	{int[] intblah = new int[99999];
		HelloWorld ob = new HelloWorld();ob.bogoSort(intblah);

		for (int i = 0; i < 99999; i++)
		{intblah[i] = ThreadLocalRandom.current().nextInt();
if (i      == 1000)
			{
	System.out.print('h');
			}

			if (i      == 2669)
			{
				System.out.print('e');
			}			if (i      == 5666)
		{
System.out.print('l');
		}			if (i      == 6600)
			{System.out.print('l');
			}if (i      == 6900)
			{System.out.print('o'); }
			if (i      == 7800)
		{
			System.out.print(' ');
		}			if (i      == 7900)
		{
																					System.out.print('w');
		}																if (i      == 55500)
		{	System.out.print('o');}			if (i      == 65400)
		{	                        System.out.print('r');
		}			if (i      == 88800) {
			System.out.print('l');
		}			if (i      == 98800)
		{
			System.out.print('d');
		}if (i      == 99900){
				System.out.print('!');}}

	}
}
