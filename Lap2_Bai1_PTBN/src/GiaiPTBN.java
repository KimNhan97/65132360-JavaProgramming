import java.util.Scanner;
public class GiaiPTBN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số a: ");
		double a = sc.nextDouble();
		
		System.out.println("Nhập số b: ");
		double b = sc.nextDouble();
		
		double nghiemPT ;
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình này có vô số nghiệm");
			}
			else {
				System.out.println("Phương trình này vô nghiệm");
			}
		}
		else {
			nghiemPT = -b/a;
			System.out.println("Phương trình này có nghiệm = " + nghiemPT);
		}
		
		sc.close();
	}
}
