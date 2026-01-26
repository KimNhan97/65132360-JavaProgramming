import java.util.Scanner ;	
import java.text.DecimalFormat;
public class QuyDoiTienTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("Nhập tiền USD: ");
		double tienUSD = sc.nextDouble();
		
		System.out.println("Nhập tiền EUR: ");
		double tienEUR = sc.nextDouble();
		
		double tienUSD_VND = tienUSD *  23500 ;
		double tienEUR_VND = tienEUR * 27000;
		
		System.out.println(tienUSD + " USD đổi sang VND = " + df.format(tienUSD_VND) + " VND");
		System.out.println(tienEUR + " EUR đổi sang VND = " + df.format(tienEUR_VND) + " VND");

		sc.close();

	}

}
