package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for p0, p1, and p2:");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double line = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (line > 0) {
			System.out.print("(" + x2 + " , " + y2 + ")" + " is on the left side of the line from " + "(" + x0 + ","
					+ y0 + ") to " + "(" + x1 + "," + y1 + ")");
		} else if (line == 0) {
			System.out.print("(" + x2 + " , " + y2 + ")" + " on the line from " + "(" + x0 + " , " + y0 + ") to " + "("
					+ x1 + " , " + y1 + ")");
		} else {
			System.out.print("(" + x2 + " , " + y2 + ")" + " is on the right side of the line from " + "(" + x0 + " , "
					+ y0 + ") to " + "(" + x1 + " , " + y1 + ")");
		}
	}

}
