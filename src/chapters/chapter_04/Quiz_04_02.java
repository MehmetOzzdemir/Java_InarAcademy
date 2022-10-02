package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_02 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		final double earthRadius=6371.01;
		System.out.print("Enter point 1 (latitude and longitude) in degrees : ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees : ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		double distance =earthRadius* Math.acos((Math.sin(Math.toRadians(x1)) *Math.sin(Math.toRadians(x2))) +
				(Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
	            Math.cos(Math.toRadians(y1) - Math.toRadians(y2))));
		System.out.print("The distance between the two points is "+distance);
	}

}
