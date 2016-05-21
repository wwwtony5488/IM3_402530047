/*
 * [A]102
 * [TA's Advise]
 * 1. �o�O�@��ݪ��X���Ȫ��{��, �]�g�o�ܦn.
 * 2. �Pı�o�X�ӬL�L�O�@�ӫ�{�M�����H, ���ѵ��A�bAnalyzer��Line 57���@��throw Exception����k.
 * 3. static v.s. non-static�����t��, ��ı�o�i�H�A��s�ݬݥL�̤��������P.
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
