package com.codechallenge;

import java.util.ArrayList;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static Integer randomInRange(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	public static void main(String[] args) {
		String hello = "Hello World";
		for (int i = 0; i < hello.length(); ++i) {
			int current = 101;
			do {
				current = randomInRange(Integer.MIN_VALUE / 10, Integer.MAX_VALUE / 10);
			} while (current != i);
			System.out.print(hello.charAt(i));
		}
		System.out.println();
	}
}
