import java.util.Scanner;
public class TinhTienLuong {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Nhập số giờ làm: ");
		double gioLam = sc.nextDouble();
		
		System.out.println("Nhập lương 1 giờ: ");
		double luong1Gio = sc.nextDouble();

		
		double tongLuong  ;
		if (gioLam <= 40 ) {
			tongLuong = luong1Gio * gioLam;
		} 
		else {
			double gioVuot = gioLam - 40;
			tongLuong = (40 * luong1Gio ) + (gioVuot * luong1Gio * 1.5 );					
		}
		
		System.out.println("Tổng tiền lương = " + tongLuong);
		
		sc.close();
	}

}
