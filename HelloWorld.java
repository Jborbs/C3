

//ALERT
//We've been trying to reach you concerning your vehicle's extended warranty.
//You should've received a notice in the mail about your car's extended warranty eligibility. Since we've not gotten a response,
// we're giving you a final git branch push before we close out your file. Press 2 to be removed and placed on our do-not-push list.
// To speak to someone about possibly extending or reinstating your vehicle's warranty, press 1 to speak with a warranty specialist.


//ping

package com.codechallenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
//pong

//The FitnessGram™ Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues. The 20 meter pa
// cer test will begin in 30 seconds. Line up at the start. The running speed starts slowly, but gets faster each minute after you hear this signal. Ding  A single lap should be completed 
// each time you hear this sound. Ding  Remember to run in a straight line, and run as long as possible. The second time you fail to complete a lap before the sound, your test is over. The test will begin on t
// he word start. On your mark, get ready, ding 

// Interface
interface Animal {
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
  }
  
  // Pig "implements" the Animal interface
  class Pig implements Animal {
	public void animalSound() {
	  // The body of animalSound() is provided here
	  System.out.println("The pig says: wee wee");
	}
	public void sleep() {
	  // The body of sleep() is provided here
	  System.out.println("Zzz");
	}
  }
  //ping
  
	class HelloWorld {
	// public static void main(String[] args) {
	//   Pig myPig = new Pig();  // Create a Pig object
	//   myPig.animalSound();
	//   myPig.sleep();
	// }
  }
  
  interface Alphabet {
	public void printLetter(); // interface method (does not have a body)
  }
  
  class HLetter implements Alphabet {
	public void printLetter() {
	  System.out.print("H");
	}
  }

  //If you or a loved one has been diagnosed with Mesothelioma you may to be entitled to financial compensation.
  
  class ELetter implements Alphabet {
	public void printLetter() {
	  System.out.print("e");
	}
  }
  
  class LLetter implements Alphabet {
	public void printLetter() {
	  System.out.print("l");
	}
  }
  
  class OLetter implements Alphabet {
	public void printLetter() {
	  System.out.print("o");
	}
  }
  
  class NoLetter implements Alphabet {
	public void printLetter() {
	  System.out.print(" ");
	}
  }
  
  class WLetter implements Alphabet {
	public void printLetter() {
	  System.out.print("W");
	}
  }
  
  class RLetter implements Alphabet {
	public void printLetter() {
	  System.out.print("r");
	}
  }
  
  class DLetter implements Alphabet {
	public void printLetter() {
	  System.out.print("d");
	}
  }
  
  class ExLetter implements Alphabet {
	public void printLetter() {
	  System.out.print("!");
	}
  }
  
  public class Main {
	public static void main(String[] args) {
	  HLetter h = new HLetter();
	  ELetter e = new ELetter();
	  LLetter l = new LLetter();
	  OLetter o = new OLetter();
	  NoLetter no = new NoLetter();
	  WLetter w = new WLetter();
	  RLetter r = new RLetter();
	  DLetter d = new DLetter();
  
	  h.printLetter();
	  e.printLetter();
	  l.printLetter();
	  l.printLetter();
	  o.printLetter();
	  no.printLetter();
	  w.printLetter();
	  o.printLetter();
	  r.printLetter();
	  l.printLetter();
	  d.printLetter();
  
	}
  }

/**
 * Created by merciersj on 8/29/2018.
 */
// public class HelloWorld {

// 	public static void main(String[] args) {

		//pong
		

	// Scanner scan = new Scanner(System.in);

	// boolean readyToPrintHelloWorldFinally = false;
	// int question = 0;
	// String[] questions = {"Who is the current CEO of JP Morgan Chase & Co.?", "How many lines of business does JPM Chase have?", "What is your favorite color?", "", ""};
	// String[] answers = {"jamie dimon", "6", "blue"};
	// String[] responses = {"Wow, you really didn't know the answer to that one? This may be pretty rough for you.", "", "I'm pretty sure it's blue.", "", ""};
	// String userInput = "";


	// while(!readyToPrintHelloWorldFinally) {

	// 	System.out.println(questions[question]);
	// 	userInput = scan.next();

	// 	if (!userInput.toLowercase().equals(answers[question])) {
	// 		System.out.println(responses[question]);
	// 	} else {
	// 		question++;
	// 	}

	// 	if (question > 4) {
	// 		readyToPrintHelloWorldFinally = true;
	// 	}

	// }

	// System.out.println("Who is the current CEO of JP Morgan Chase & Co.?");

	// String s = scan.next();

	// if (!s.toLowercase().equals("jamie dimon")) {
	// 	System.out.println("Wow, you really didn't know the answer to that one? This may be pretty rough for you.");
	// } else {
	
	// System.out.println("How many lines of business does JPM Chase have?");

	// }


	// System.out.print("H");
	// System.out.print("E");
	// System.out.print("L");
	// System.out.print("L");
	// System.out.print("O");
	// System.out.print(" ");
	// System.out.print("W");
	// System.out.print("O");
	// System.out.print("R");
	// System.out.print("L");
	// System.out.print("D");
	// System.out.print("!");
// 	}


// }
