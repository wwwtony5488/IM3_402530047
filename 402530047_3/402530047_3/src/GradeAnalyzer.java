import java.util.ArrayList;

class Count {
	String rank;
	int count;

	Count() {
	}

	Count(String _rank, int _count) {
		this.rank = _rank;
		this.count = _count;
	}

	public String toString() {
		return this.rank + "=" + this.count;
	}
}

public class GradeAnalyzer {

	int inputcount = 0;
	int vaildcount = 0;
	double Total = 0, standard = 0, average = 0, num = 0, temp = 0;
	ArrayList<Double> NumScore = new ArrayList<Double>();
	Count[] GradeArray = new Count[11];
	int a = 1;

	// 其實我覺得這用static有點沒必要, 想想看為什麼.
	static boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0)
			return true;
		else {
			return false;
		}
	}

	void addGrade(double aGrade) {

		// Good! +2
		if (a == 1) {
			GradeArray[0] = new Count("A+", 0);
			GradeArray[1] = new Count("A ", 0);
			GradeArray[2] = new Count("A-", 0);
			GradeArray[3] = new Count("B+", 0);
			GradeArray[4] = new Count("B ", 0);
			GradeArray[5] = new Count("B-", 0);
			GradeArray[6] = new Count("C+", 0);
			GradeArray[7] = new Count("C ", 0);
			GradeArray[8] = new Count("C-", 0);
			GradeArray[9] = new Count("D ", 0);
			GradeArray[10] = new Count("F ", 0);
			a++;
		}

		if (!isValidGrade(aGrade)) {
			// 或許可以試試看throw Exception會不會更好呢?
			return;
		}
		NumScore.add(aGrade);
		Total += aGrade;
		inputcount++;

		// Nest Structure is good!
		if (aGrade > 90) {
			if (aGrade >= 98)
				GradeArray[0].count++;
			else if (aGrade >= 92)
				GradeArray[1].count++;
			else
				GradeArray[2].count++;
		} else if (aGrade > 80) {
			if (aGrade >= 88)
				GradeArray[3].count++;
			else if (aGrade >= 82)
				GradeArray[4].count++;
			else
				GradeArray[5].count++;
		} else if (aGrade > 70) {
			if (aGrade >= 78)
				GradeArray[6].count++;
			else if (aGrade >= 72)
				GradeArray[7].count++;
			else
				GradeArray[8].count++;
		} else {
			if (aGrade >= 60)
				GradeArray[9].count++;
			else
				GradeArray[10].count++;
		}
	}

	void analyzeGrades() {
		average = Total / inputcount;
		for (int i = 0; i < NumScore.size(); i++) {
			temp += (NumScore.get(i) - average) * (NumScore.get(i) - average);
		}
		standard = Math.round((Math.sqrt(temp / inputcount)));
	}

	public String toString() {
		String rlt = "";
		for (int i = 0; i < GradeArray.length; i++) {
			rlt += GradeArray[i] + "\n";
		}
		return "The grade distribution is:\n\n" + rlt;
	}
}
