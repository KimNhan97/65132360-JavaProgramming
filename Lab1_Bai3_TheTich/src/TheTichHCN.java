import java.util.Scanner;
public class TheTichHCN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/**Nhập cạnh**/
		System.out.println("Nhập cạnh của khối lập phương: ");
		double canh = sc.nextDouble();
		
		/***Tính thể tích**/
		double theTich = canh * canh * canh;
		
		/**Kết quả**/
		System.out.println("Thể tích của khối chữ nhật: " + theTich);
		
		sc.close();
		
		
	}
	
}
