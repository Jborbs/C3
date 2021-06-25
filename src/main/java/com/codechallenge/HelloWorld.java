package com.codechallenge;

import java.util.ArrayList;


/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
		Duck duck = new Duck();
		String quack = duck.getDuckQuack();
		System.out.println(quack);
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


}

//read a file
//insertion sort
//find single occurence of letter
