
public class Calc {
	static void calc(Student std) {
		std.tot = std.kor + std.eng + std.mat;
		std.avg = std.tot / 3.0;

		std.grade = (std.avg >= 90) ? 'A'
				: ((std.avg >=80) ? 'B' : ((std.avg >= 70) ? 'C' : ((std.avg >= 60) ? 'D' : 'F')));
	}
}
