package chapters.chapter_05;
import java.util.Scanner;
public class Quiz_05_44 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an İnteger : ");
		short number =input.nextShort();
		String bits="";
		for(int i =0;i<16;i++) {
			bits = (number & 1) + bits;
			number >>= 1;
		}
		System.out.println("The bits are " + bits);
	}

}
