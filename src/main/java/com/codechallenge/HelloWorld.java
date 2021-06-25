package com.codechallenge;

import java.util.ArrayList;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
		String lyrics = "Look at this photograph Every time I do, it makes me laugh How did our eyes get so red? And what the hell is on Joey's head? And this is where I grew upI think the present owner fixed it upI never knew we'd ever went withoutThe second floor is hard for sneaking outAnd this is where I went to schoolMost of the time had better things to doCriminal record says I broke in twiceI must have done it half a dozen timesI wonder if it's too lateShould I go back and try to graduate?Life's better now than it was back thenIf I was them, I wouldn't let me inOh, whoa, whoaOh, God, I-Every memory of looking out the back doorI had the photo album spread out on my bedroom floorIt's hard to say it, time to say itGoodbye, goodbyeEvery memory of walking out the front doorI found the photo of the friend that I was looking forIt's hard to say it, time to say itGoodbye, goodbyeRemember the old arcadeBlew every dollar that we ever madeThe cops hated us hangin' outThey say, \"Somebody went and burned it down\"We used to listen to the radioAnd sing along with every song we knowWe said, \"Someday we'd find out how it feelsTo sing to more than just the steering wheel\"Kim's the first girl I kissedI was so nervous that I nearly missedShe's had a couple of kids since thenI haven't seen her since God knows whenOh, whoa, whoaOh, God, I-Every memory of looking out the back doorI had the photo album spread out on my bedroom floorIt's hard to say it, time to say itGoodbye, goodbyeEvery memory of walking out the front doorI found the photo of the friend that I was looking forIt's hard to say it, time to say itGoodbye, goodbyeI miss that townI miss the facesYou can't eraseYou can't replace itI miss it nowI can't believe itSo hard to stayToo hard to leave itIf I could I relive those daysI know the one thing that would never changeEvery memory of looking out the back doorI had the photo album spread out on my bedroom floorIt's hard to say it, time to say itGoodbye, goodbyeEvery memory of walking out the front doorI found the photo of the friend that I was looking forIt's hard to say it, time to say itGoodbye, goodbyeLook at this photographEvery time I do, it makes me laughEvery time I do, it makes me-";

		String[] hello = { "H", "E", "L", "L", "O", " ", "W", "O", "R", "L", "D" };
		String result = "";

		for (int i = 0; i < hello.length; i++) {
			for (int j = 0; j < lyrics.length(); j++) {
				char c = lyrics.charAt(j);
				if (hello[i].toLowerCase().equals(Character.toString(c).toLowerCase())) {
					if (i == 0 || i == 6) {
						result += Character.toString(c).toUpperCase();
						break;
					} else {
						result += c;
						break;
					}
				}
			}
		}

		System.out.println(result);
	}
}
