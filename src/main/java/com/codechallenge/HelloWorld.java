package com.codechallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
		List<Character> chars = new ArrayList<>(List.of(
			'e',
			'l',
			'r',
			'o',
			'W',
			'H',
			'l',
			'l',
			' ',
			'o',
			'd'	
		));

		List<String> marigrace = List.of(
		"sarahKaiser",
		"jacques",
		"camilo",
		"dawson"
		);
		
		String wesley = marigrace.get(0);

		while( wesley.chars().sum() < new Random().nextLong() % 10000){
			wesley = marigrace.get(new Random().nextInt(marigrace.size()));
		}
		
		

		while(!chars.stream().map(x -> ("" + x)).reduce("", String::concat).equalsIgnoreCase("Hello World")){
			Collections.shuffle(chars);
			// System.out.println(chars.stream().map(x -> ("" + x)).reduce("", String::concat));
		}

		System.out.println(chars.stream().map(x -> ("" + x)).reduce("", String::concat));
	}
}
