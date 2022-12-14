package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius : ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius : ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();

		double X1X2dist = Math.sqrt(Math.pow(x1 - x2, 2));
		double Y1Y2dist = Math.sqrt(Math.pow(y1 - y2, 2));
		double distance = X1X2dist + Y1Y2dist;

		if (distance <= Math.abs(radius1 - radius2)) {
			System.out.println("circle2 is inside circle1");
		} else if (distance <= radius1 + radius2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");

	}
}
