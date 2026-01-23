import java.util.Scanner;
public class Delta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		double a = sc.nextDouble();
		
		System.out.println("Nhập b: ");
		double b = sc.nextDouble();
		
		System.out.println("Nhập c: ");
		double c = sc.nextDouble();
		
		 double delta = Math.pow(b, 2) - 4 * a * c;
		 System.out.println("Delta = "+ delta);
		
		if(delta >= 0 ) {
			double canDelta = Math.sqrt(delta);
			System.out.println("Căn delta = "+ canDelta);
		}
		else {
			System.out.println("Vì delta nhỏ hơn không nên không có căn");
		}
		
		sc.close();
	}

}
