import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		
		if(x < y){
			System.out.println("x is less than y");
		}
		
		else if(x>y){
			System.out.println("x is greater than y");
		}
		else{
			System.out.println("x is greater than y");
		}
	}

}
