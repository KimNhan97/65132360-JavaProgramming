import java.util.Scanner;

public class MenuBaiTap {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int chon;

        do {
            menu();
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chọn sai! Vui lòng chọn từ 1 đến 4.");
            }

        } while (chon != 4);

        sc.close();
    }

    // ===== MENU =====
    public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất                       +");
        System.out.println("2. Giải phương trình bậc 2                          +");
        System.out.println("3. Tính tiền điện                                   +");
        System.out.println("4. Kết thúc                                         +");
        System.out.println("+---------------------------------------------------+");
    }

    // ===== BÀI 1 =====
    public static void giaiPTB1() {
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
    }

    // ===== BÀI 2 =====
    public static void giaiPTB2() {
    	System.out.println("Nhập số a: ");
		double a = sc.nextDouble();
		
		System.out.println("Nhập số b: ");
		double b = sc.nextDouble();
		
		System.out.println("Nhập số c: ");
		double c = sc.nextDouble();
		
        if (a == 0) {           
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình bậc nhất có nghiệm x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    // ===== BÀI 3 =====
    public static void tinhTienDien() {
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
    }
}