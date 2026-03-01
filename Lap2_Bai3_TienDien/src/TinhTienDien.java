import java.util.Scanner;
public class TinhTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số điện sử dụng: ");
		double soDien = sc.nextDouble();
		
		double tienDien;

	    if (soDien <= 50) {
	            tienDien = soDien * 1000;
	     	} 
	    else {
	            tienDien = 50 * 1000 + (soDien - 50) * 1200;
	        }
	        System.out.println("Tiền điện của bạn là: " + tienDien);
		sc.close();
}

}
