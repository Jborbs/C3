package com.codechallenge;

import java.util.ArrayList;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
		HelloWorldLinkedList helloWorldLinkedList = new HelloWorldLinkedList();
		String temp = "dlroW olleH";
		for(int i = 0; i < temp.length(); ++i){
			helloWorldLinkedList.add((temp.substring(i, i+1)).charAt(0));
		}
		Character[] result = new Character[11];
		int i = 10;
		while(!helloWorldLinkedList.isEmpty()){
			result[i] = helloWorldLinkedList.pop();
			--i;
		}
		String temp1 ="";
		for(int j = 0; j < 11; ++j){
			temp1 += result[j];
		}
		System.out.println(temp1);
	}
}
