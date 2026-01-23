import java.util.Scanner;
public class TinhChuViDienTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double dai = sc.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = sc.nextDouble();

        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.println("Chu vi = " + chuVi);
        System.out.println("Diện tích = " + dienTich);
        System.out.println("Cạnh nhỏ = " + canhNho);

        sc.close();
    }
}
