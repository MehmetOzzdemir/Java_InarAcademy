package chapters.chapter_03;
import java.util.Scanner;
public class Quiz_03_01 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter 'a' 'b' 'c' ");
		double a =input.nextDouble();
		double b =input.nextDouble();
		double c =input.nextDouble();
		double delta=(b*b)-(4*a*c);
		double r1 =((-b+Math.pow(delta,0.5))/(2*a));
		double r2 =((-b-(Math.pow(delta,0.5)))/(2*a));
		if(delta>0) {
		System.out.println("The equation has two roots "+r1+" and "+r2);
		}else if(delta==0) {
			System.out.println("The equation has one roots "+r1);
		}else
			System.out.println("The equation has no real roots");
	}

}
