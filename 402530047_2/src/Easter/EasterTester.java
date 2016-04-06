/*
 * [A]93
 * [TA's Advise]
 * 1.Good JOB!
 * 2.javadoc放在一起,不用額外移出來 , 扣3分
 * 3.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 */

package Easter;

//import Easter.Easter;
public class EasterTester {
	private EasterTester() {
	}

	public static void main(String[] args) {
		System.out.println(Easter.calculateEaster(2001));
		System.out.println(Easter.calculateEaster(2012));

	}
}
