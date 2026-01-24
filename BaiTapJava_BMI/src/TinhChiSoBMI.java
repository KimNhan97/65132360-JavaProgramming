import java.util.Scanner;
public class TinhChiSoBMI {
	public static void main(String[] args) {
		/**
		 BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập cân nặng của bạn ( kg) : ");
		double canNang = sc.nextDouble();
		
		System.out.println("Nhập chiều cao của bạn ( m ): ");
		double chieuCao = sc.nextDouble();
		
		double chisoBMI = canNang /( chieuCao * chieuCao );
		System.out.println("Chỉ số BMI của bạn = " + chisoBMI);
		
		/**
		 Phân loại BMI
		 */	
		if ( chisoBMI < 18.5 )
		{
			System.out.println("Bạn đang bị thiếu cân ! Hãy ăn uống đầy đủ và tập luyện đúng <3 ");
		}
		else if(chisoBMI < 25 ) {
			System.out.println("Bạn đang ở mức bình thường ! Tuyệt vời, giữ mức này nhé <3 ");
		}
		else if (chisoBMI < 30 ) {
			System.out.println("Bạn đang bị thừa cân ! Hãy giảm cân ngay !!!");
		}
		else {
			System.out.println("Bạn đang ở mức béo phì rồi ! Hãy giảm cân để tốt cho sức khỏe");
		}
	}

}
