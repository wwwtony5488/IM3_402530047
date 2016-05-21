/*
 * [A]102
 * [TA's Advise]
 * 1. 這是一支看的出價值的程式, 也寫得很好.
 * 2. 感覺得出來昭昭是一個思慮清晰的人, 提供給你在Analyzer的Line 57有一個throw Exception的方法.
 * 3. static v.s. non-static之間差異, 我覺得可以再研究看看他們之間的不同.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		String TempInput = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		while (true) {
			TempInput = JOptionPane.showInputDialog(null, "please input a score:");
			if (TempInput.equalsIgnoreCase("q")) {
				if (GA.inputcount > 1) {
					break;
				} else {
					System.out.println(
							"You did not enter enough grades to analyze.  Please enter at least 2 valid grades ");
				}
			}
			try {
				GA.addGrade(Double.parseDouble(TempInput));
			} catch (Exception e) {
				System.out.println("please input valid number");
			}
		}

		GA.analyzeGrades();
		System.out
				.println("You entered " + GA.inputcount + "Valid grades from 0 to 110.  Invalid grades are ignored! ");
		System.out.println("The average = " + (int) GA.average + " with a standard deviation = " + (int) GA.standard);
		System.out.println(GA);

	}

}
