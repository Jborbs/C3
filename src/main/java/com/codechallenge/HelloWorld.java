package com.codechallenge;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
		Random r = new Random();
		Random r0 = new Random();
		Random r1 = new Random();

		char[] hello = {'^','!','f','R','@','^','@','T','@','j','@','^','G','^','$','@','#','j','$','@','$','3','2','F','4','n','F','i','!','d','#','T','@','#','0','i','^','2','R','r','9','F','#','2','f','@','T','0','3','F'};
		char[] world = {'@','#','@','T','T','R','#','3','9','n','2','3','%'};
		char[] to = {'u','f','Q','f','i','f','2','w','@','G','n','#','@','o','T','@','f','2','@','g','j','f','u','4','j','f','3','2','f','o'};
		char[] chase = {'i','r','f','G','@','2','$','2','2','g','r','n','2','N','Q','2','e','F','j','r','g','2','f','e','!'};
		// HelloWorld \u001c System.out.print('good luck friend');
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00CC System.out.print("H");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u002A System.out.print("e");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u001c System.out.print("H");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u004d System.out.print("nope");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00aa System.out.print("H");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u000d System.out.print("H");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00FF System.out.print("H");
		int var = r1.nextInt(3248439);
		var /= 4;
		var /= 2;
		var /= 4382;
		char hem = (char)var;
		// hem2 \u002c System.out.print("chase");
		int clazz = reduce(0, 0xAA, 0xDEADBEEF, 0xDDDD, 0x000001);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00CC System.out.print(clazz);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u000d System.out.print((char)clazz);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u002A System.out.print(hello);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u001c System.out.print(clazz);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u004d System.out.print((int)"nope");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00aa System.out.print("b");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00FF System.out.print("c");

		hello[42] = 101;
		world[11] = 96;

		to[12] = 66;
		chase[13] = 88;
		int im = println(hello[42]);
		int hungry = println(world[11]);
		println(to[16]);
		println(chase[0]);

		String dont = callMe();
		String doPls = callMe();
		char getMe = no();

		// HelloWorld \u00CC System.out.print(clazz);
		// HelloWorld \u004d System.out.print((int)"nope");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00aa System.out.print("b");
		// HelloWorld \u00FF System.out.print("c");
		// HelloWorld \u000d System.out.print('o');
		// HelloWorld \u002A System.out.print('no');
		// HelloWorld \u001c System.out.print('nop');
		// HelloWorld \u000d System.out.print(getMe);

		// HelloWorld \u00CC System.out.print(clazz);
		// HelloWorld \u004d System.out.print((int)"nope");
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00aa System.out.print("b");
		// HelloWorld \u00FF System.out.print("c");
		// HelloWorld \u002A System.out.print('no');
		// HelloWorld \u001c System.out.print('nop');
		// HelloWorld \u001c System.out.print('For the');
		// HelloWorld \u000d System.out.print('W');
		// HelloWorld \u001c System.out.print('I');
		// HelloWorld \u00da System.out.print('N');

		// HelloWorld \u002A System.out.print((char)111);
		// HelloWorld \u001c System.out.print((char)111);
		// HelloWorld \u000d System.out.print((char)111);
		// HelloWorld \u000d System.out.print((char)114);
		// HelloWorld \u001c System.out.print((char)114);
		// HelloWorld \u001c System.out.print((char)114);
		// HelloWorld \u000d System.out.print((char)108);
		// HelloWorld \u000d System.out.print((char)100);

		// 32
		// 111 o

		// 87 W

		// r 114

		// D 100
	}

	public static int reduce(int a, int b, int c, int four, int five) {
		if(a <= -10)
			return 101;
		if(b <= -11)
			return 96;
		if(c >= -12)
			return 6996;
		return reduce(a-1, b / 2, c / 3, four / 4, five / 5);

	}

	public int notReduce(char c, char a, char t) {
		return 76;
	}

	public int doesReduce() {
		return 0;
	}

	public static String callMe() {
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00CC System.out.print(world);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u002A System.out.print(hello);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u000d System.out.print((char)108);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u001c System.out.print(nop);

		return "okay :(";
	}

	public static char no() {
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u00CC System.out.print(world);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u002A System.out.print(hello);
		// AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \u001c System.out.print(nop);

		return (char)32;
	}

	public static int println(char toPrint) {
		// HelloWorld \u002A System.out.print(toPrint);
		// HelloWorld \u001c System.out.print((char)111);
		// HelloWorld \u00cc System.out.print((char)toPrint);
		// HelloWorld \u001a System.out.print((char)114);
		// HelloWorld \u001c System.out.print((char)toPrint);
		// HelloWorld \u001c System.out.print((char)114);
		// HelloWorld \u00dd System.out.print((char)toPrint);
		// HelloWorld \u00ef System.out.print((char)100);

		return 13;
	}

}
