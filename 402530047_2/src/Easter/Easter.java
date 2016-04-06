package Easter;

public class Easter {

	private Easter() {
	}

	public static String calculateEaster(int inputYear) {
		int year = inputYear;
		int a = year % 19;
		int b = year % 4;
		int c = year % 7;
		int k = year / 100;// Math.floor(), -2
		int p = (13 + 8 * k) / 25;// Math.floor()
		int q = k / 4;// Math.floor()
		int M = (15 - p + k - q) % 30;
		int N = (4 + k - q) % 7;
		int d = (19 * a + M) % 30;
		int e = (2 * b + 4 * c + 6 * d + N) % 7;
		int n;

		String output = "";
		if ((d + e) < 10) {
			n = d + e + 22;
			output = "In " + year + ",Easter Sunday is:month=3 and day =" + n;
		} else {
			n = d + e - 9;
			if (n == 26) {
				n = 19;
			}
			// (11M + 11) mod 30 < 19? -2
			if (n == 25 && d == 28 && e == 6 && a > 10)
				n = 18;
		}

		output = "In " + year + ",Easter Sunday is:month=4 and day =" + n;

		return output;

		// 或許上面兩個output的String可以在最後回傳就好了, 像是下面這樣的寫法, 需要再加入一個month的變數
		// return "In " + year + ",Easter Sunday is:month="+ m +" and day =" +
		// n;
	}

}
