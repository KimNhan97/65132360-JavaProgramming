import java.util.Scanner;
public class DTBSinhVien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập họ tên sinh viên: ");
	        String hoTen = scanner.nextLine();

	        System.out.print("Nhập điểm trung bình: ");
	        double diemTB = scanner.nextDouble();

	        System.out.println("----- THÔNG TIN SINH VIÊN -----");
	        System.out.println("Họ tên sinh viên: " + hoTen);
	        System.out.println("Điểm trung bình: " + diemTB);

	        scanner.close();
	}

}
